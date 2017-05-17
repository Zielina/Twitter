package Twitter.OauthToken;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Properties;

public class OauthTokenAuthentication {
    private Properties properties;
    private String authentication;

    public OauthTokenAuthentication() {
        String ConsumerSecre = "3YnEwESDugQ6iwTHtNXR9IUCl5E1TJtGoKbkb1t6AOVpVuvxIJ";
        String ConsumerKey = "I4Xyfl7P0C3bwhF5eKd54g9Vm";

        try {
            String key = URLEncoder.encode(ConsumerKey, "UTF-8");
            String secret = URLEncoder.encode(ConsumerSecre, "UTF-8");
            this.authentication = Base64.getEncoder().encodeToString((key + ":" + secret).getBytes("utf-8"));
            System.out.println("authentication " + this.authentication);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getAuthentication() {
        return this.authentication;
    }
}
