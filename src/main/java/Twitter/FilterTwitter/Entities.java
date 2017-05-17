package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entities {

    private List<Object> hashtags = null;
    private List<Object> symbols = null;
    private List<Object> user_mentions = null;
    private List<Url> urls = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<Object> getuser_mentions() {
        return user_mentions;
    }

    public void setuser_mentions(List<Object> userMentions) {
        this.user_mentions = user_mentions;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
