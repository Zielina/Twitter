package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.Map;

public class Entities_ {

    private Description description;
    private Url_ url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Url_ getUrl() {
        return url;
    }

    public void setUrl(Url_ url) {
        this.url = url;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
