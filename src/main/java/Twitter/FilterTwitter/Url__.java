package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Url__ {

    private String url;
    private String expanded_url;
    private String display_url;
    private List<Integer> indices = null;
    private Map<String, Object> additional_properties = new HashMap<String, Object>();


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpanded_url() {
        return expanded_url;
    }

    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public List<Integer> getIndices() {
        return indices;
    }

    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    public Map<String, Object> getAdditional_properties() {
        return additional_properties;
    }

    public void setAdditional_properties(Map<String, Object> additional_properties) {
        this.additional_properties = additional_properties;
    }
}
