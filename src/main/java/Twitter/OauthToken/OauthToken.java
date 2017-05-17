package Twitter.OauthToken;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class OauthToken {
    static Logger log = Logger.getLogger(OauthToken.class.getName());
    private static Oauth oauth;
    private String access_token;
    private static LoadingCache<String, Oauth> cache;

    public String getaccess_token() {
        return this.access_token;
    }

    public OauthToken() {
        try {
            log.info("Cache Oauth Token");
            this.access_token = ((Oauth)cache.get("oauth_twitter")).getaccess_token();
        } catch (ExecutionException e) {
            log.log(Level.SEVERE, "ExecutionException", e.getMessage());
        }

    }

    private static Oauth oAuthToken(String id) {
        try {
            OauthTokenAuthentication oauthTokenAuthentication = new OauthTokenAuthentication();
            String authentication = oauthTokenAuthentication.getAuthentication();
            if(oauthTokenAuthentication.getAuthentication() != null) {
                log.info(" oauthTokenAuthentication is not null");
            } else {
                log.info(" oauthTokenAuthentication  is null");
            }

            HttpClient client = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost("https://api.twitter.com/oauth2/token");
            Gson gson = (new GsonBuilder()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
            httpPost.setHeader("Authorization", "Basic " + authentication);
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            List<NameValuePair> urlParameters = new ArrayList();
            urlParameters.add(new BasicNameValuePair("grant_type", "client_credentials"));
            httpPost.setEntity(new UrlEncodedFormEntity(urlParameters));
            HttpResponse response = client.execute(httpPost);
            log.info("Response Code : " + response.getStatusLine().getStatusCode());
            HttpEntity entity = response.getEntity();
            String jsonEntity = EntityUtils.toString(entity);
            oauth = (Oauth)gson.fromJson(jsonEntity, Oauth.class);
            log.info("Value Oauth Access Token " + oauth.getaccess_token());
            log.info("Oauth get Token from Twitter " + id);
        } catch (UnsupportedEncodingException e) {
            log.log(Level.SEVERE, e.getMessage());
        } catch (IOException e) {
            log.log(Level.SEVERE, e.getMessage());
        }

        return oauth;
    }

    public OauthToken(String test) {
        while(true) {
            while(true) {
                try {
                    System.out.println("Cache " + ((Oauth)cache.get("oauth_twitter")).getaccess_token());
                    System.out.println(new Date());
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    log.log(Level.SEVERE, e.getMessage());
                } catch (ExecutionException e) {
                    log.log(Level.SEVERE, e.getMessage());
                }
            }
        }
    }

    static {
        cache = CacheBuilder.newBuilder().maximumSize(1000L).expireAfterAccess(10L, TimeUnit.MINUTES).recordStats().build(new CacheLoader<String, Oauth>() {
            public Oauth load(String s) {
                OauthToken.log.info("Creat cache with access token ");
                return OauthToken.oAuthToken(s);
            }
        });
    }
}
