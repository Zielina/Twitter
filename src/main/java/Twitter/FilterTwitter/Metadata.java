package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.Map;

public class Metadata {

    private String iso_language_code;
    private String result_type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getiso_language_code() {
        return iso_language_code;
    }

    public void setiso_language_code(String iso_language_code) {
        this.iso_language_code = iso_language_code;
    }

    public String getresult_type() {
        return result_type;
    }

    public void setresult_type(String result_type) {
        this.result_type = result_type;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
