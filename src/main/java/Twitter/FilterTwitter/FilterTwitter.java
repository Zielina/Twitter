package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterTwitter {

    private List<Status> statuses = null;
    private Search_Metadata search_metadata;
    private Map<String, Object> additional_properties = new HashMap<String, Object>();

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public Search_Metadata getSearch_metadata() {
        return search_metadata;
    }

    public void setSearch_metadata(Search_Metadata search_metadata) {
        this.search_metadata = search_metadata;
    }

    public Map<String, Object> getAdditional_properties() {
        return additional_properties;
    }

    public void setAdditional_properties(Map<String, Object> additional_properties) {
        this.additional_properties = additional_properties;
    }
}
