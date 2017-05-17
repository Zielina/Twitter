package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Url {

    private String url;
    private String expanded_url;
    private String display_url;
    private List<Integer> indices = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getexpanded_url() {
        return expanded_url;
    }

    public void setexpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }

    public String getdisplay_url() {
        return display_url;
    }

    public void setdisplay_url(String displayUrl) {
        this.display_url = displayUrl;
    }

    public List<Integer> getIndices() {
        return indices;
    }

    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
