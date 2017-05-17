package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.Map;

public class Search_Metadata {

    private String completed_in;
    private String max_id;
    private String max_id_str;
    private String query;
    private String refresh_url;
    private Integer count;
    private Integer since_id;
    private String since_id_str;
    private Map<String, Object> additional_properties = new HashMap<String, Object>();

    public String getCompleted_in() {
        return completed_in;
    }

    public void setCompleted_in(String completed_in) {
        this.completed_in = completed_in;
    }

    public String getMax_id() {
        return max_id;
    }

    public void setMax_id(String max_id) {
        this.max_id = max_id;
    }

    public String getMax_id_str() {
        return max_id_str;
    }

    public void setMax_id_str(String max_id_str) {
        this.max_id_str = max_id_str;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getRefresh_url() {
        return refresh_url;
    }

    public void setRefresh_url(String refresh_url) {
        this.refresh_url = refresh_url;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSince_id() {
        return since_id;
    }

    public void setSince_id(Integer since_id) {
        this.since_id = since_id;
    }

    public String getSince_id_str() {
        return since_id_str;
    }

    public void setSince_id_Str(String since_id_str) {
        this.since_id_str = since_id_str;
    }

    public Map<String, Object> getAdditional_properties() {
        return additional_properties;
    }

    public void setAdditional_properties(Map<String, Object> additional_properties) {
        this.additional_properties = additional_properties;
    }
}
