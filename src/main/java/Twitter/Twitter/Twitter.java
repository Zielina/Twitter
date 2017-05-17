package Twitter.Twitter;

import Twitter.FilterTwitter.FilterTwitter;
import Twitter.FilterTwitter.Status;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;



/**
 * Created by bartosz.zielinski on 2017-04-28.
 */

public class Twitter {

    private static List<String> list;
    static Logger log = Logger.getLogger(Twitter.class.getName());

    public Twitter() {
    }

    public static List<String> twitterClient(String Authorization, String userName) {
        URI url = null;
        Object var3 = null;

        try {
            url = new URI("https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name=" + URLEncoder.encode(userName, "UTF8"));
            Gson gson = (new GsonBuilder()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
            String jsonEntity = requestMakeGet(url, Authorization);
            Status[] status = (Status[])gson.fromJson(jsonEntity, Status[].class);
            log.info("Get Request by Twitter Api by sending name of user name");
            List<Status> statusList = Arrays.asList(status);
            list = new ArrayList();
            ListIterator listIterator = statusList.listIterator();

            while(listIterator.hasNext()) {
                Status status1 = (Status)listIterator.next();
                list.add(status1.gettext());
            }
        } catch (UnsupportedEncodingException e) {
            log.log(Level.SEVERE, "UnsupportedEncodingException" + e.getMessage());
        } catch (URISyntaxException e) {
            log.log(Level.SEVERE, "URISyntaxException" + e.getMessage());
        } catch (JsonSyntaxException e) {
            log.log(Level.SEVERE, "JsonSyntaxException" + e.getMessage());
        } catch (NullPointerException e) {
            log.log(Level.SEVERE, "Not authorized" + e.getMessage());
        }

        return list;
    }

    public static List<Status> twitterFiltrClient(String Authorization, String wordkey) {
        URI url = null;
        List<Status> listStatus = null;
        log.info("Get Request by Twitter Api by sending name of  key words");

        try {
            url = new URI("https://api.twitter.com/1.1/search/tweets.json?q=" + URLEncoder.encode(wordkey, "UTF8"));
            Gson gson = (new GsonBuilder()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
            String jsonEntity = requestMakeGet(url, Authorization);
            FilterTwitter filterTwitter = (FilterTwitter)gson.fromJson(jsonEntity, FilterTwitter.class);
            listStatus = filterTwitter.getStatuses();
        } catch (URISyntaxException e) {
            log.log(Level.SEVERE, "URISyntaxException" + e.getMessage());
        } catch (UnsupportedEncodingException e) {
            log.log(Level.SEVERE, "UnsupportedEncodingException" + e.getMessage());
        } catch (JsonSyntaxException e) {
            log.log(Level.SEVERE, "JsonSyntaxException" + e.getMessage());
        } catch (NullPointerException e) {
            log.log(Level.SEVERE, "Not authorized" + e.getMessage());
        }

        return listStatus;
    }

    private static String requestMakeGet(URI url, String authorization) {
        String entityJson = null;

        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("Authorization", "Bearer " + authorization);
            HttpResponse response = client.execute(httpGet);
            HttpEntity entity = response.getEntity();
            entityJson = EntityUtils.toString(entity);
        } catch (IOException e) {
            log.log(Level.SEVERE, "Exception :: " + e.getMessage());
        }

        return entityJson;
    }


}
