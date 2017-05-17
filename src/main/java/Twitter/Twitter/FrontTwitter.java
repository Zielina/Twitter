package Twitter.Twitter;

import Twitter.FilterTwitter.Status;
import Twitter.OauthToken.OauthToken;

import java.util.List;

/**
 * Created by bartosz.zielinski on 2017-05-05.
 */
import Twitter.FilterTwitter.Status;
import Twitter.OauthToken.OauthToken;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class FrontTwitter {
    static Logger log = Logger.getLogger(FrontTwitter.class.getName());
    private static LoadingCache<String, List<String>> cacheWordKey;
    private static LoadingCache<String, List<String>> cacheUserName;

    public FrontTwitter() {
    }

    public static List<String> frontTwitterListTwittersKeyWord(String keyWord) throws ExecutionException {
        return (List)cacheWordKey.get(keyWord);
    }

    public static List<String> frontTwitterListTwittersUserName(String userName) throws ExecutionException {
        return (List)cacheUserName.get(userName);
    }

    public static List<String> getMessage(String wordkey) {
        log.info("Get Twitters from key word" + wordkey);
        OauthToken oauthToken = new OauthToken();
        List<Status> twitter = Twitter.twitterFiltrClient(oauthToken.getaccess_token(), wordkey);
        List<String> listArray = new ArrayList();

        for(int i = 0; i < twitter.size(); ++i) {
            listArray.add(((Status)twitter.get(i)).gettext());
        }

        return listArray;
    }

    public static List<String> getMessageUsername(String userName) {
        log.info("Get Twitters from User Name " + userName);
        OauthToken oauthToken = new OauthToken();
        List<String> twitter = Twitter.twitterClient(oauthToken.getaccess_token(), userName);
        return twitter;
    }

    static {
        cacheWordKey = CacheBuilder.newBuilder().maximumSize(1000L).expireAfterAccess(10L, TimeUnit.MINUTES).recordStats().build(new CacheLoader<String, List<String>>() {
            public List<String> load(String s) {
                FrontTwitter.log.info("Creat cache with Twitter from key words ");
                return FrontTwitter.getMessage(s);
            }
        });
        cacheUserName = CacheBuilder.newBuilder().maximumSize(1000L).expireAfterAccess(10L, TimeUnit.MINUTES).recordStats().build(new CacheLoader<String, List<String>>() {
            public List<String> load(String s) {
                FrontTwitter.log.info("Creat cache with Twitter from User Name ");
                return FrontTwitter.getMessageUsername(s);
            }
        });
    }
}