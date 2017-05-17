package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Url_ {

    private List<Url__> urls = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Url__> getUrls() {
        return urls;
    }

    public void setUrls(List<Url__> urls) {
        this.urls = urls;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
