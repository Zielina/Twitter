package Twitter.OauthToken;



/**
 * Created by bartosz.zielinski on 2017-05-01.
 */

public class Oauth {

        private String token_type;
        private String access_token;


    public String gettoken_type(){
            return token_type;
        }
    public void settoken_type(String input){
            this.token_type = input;
        }
    public String getaccess_token(){
            return access_token;
        }
    public void setaccess_token(String input){
            this.access_token = input;
        }

}
