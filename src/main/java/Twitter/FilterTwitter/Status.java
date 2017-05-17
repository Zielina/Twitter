package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.Map;

public class Status {

    private String created_at;
    private String id;
    private String id_str;
    private String text;
    private Boolean truncated;
    private Entities entities;
    private Metadata metadata;
    private String source;
    private Object in_reply_to_status_id;
    private Object in_reply_to_status_id_str;
    private Object in_reply_to_user_id;
    private Object in_reply_to_user_id_str;
    private Object in_reply_to_screen_name;
    private User user;
    private Object geo;
    private Object coordinates;
    private Object place;
    private Object contributors;
    private Boolean is_quote_status;
    private Integer retweet_count;
    private Integer favorite_count;
    private Boolean favorited;

    public Boolean getIs_quote_status() {
        return is_quote_status;
    }

    public void setIs_quote_status(Boolean is_quote_status) {
        this.is_quote_status = is_quote_status;
    }

    public Integer getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(Integer retweet_count) {
        this.retweet_count = retweet_count;
    }

    public Integer getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(Integer favorite_count) {
        this.favorite_count = favorite_count;
    }

    public Boolean getPossibly_sensitive() {
        return possibly_sensitive;
    }

    public void setPossibly_sensitive(Boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    private Boolean retweeted;
    private Boolean possibly_sensitive;
    private String lang;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getcreated_at() {
        return created_at;
    }

    public void setcreated_at(String createdAt) {
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getid_str() {
        return id_str;
    }

    public void setid_str(String idStr) {
        this.id_str = id_str;
    }

    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text = text;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getin_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setin_reply_to_status_id(Object in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public Object getin_reply_to_status_id_tr() {
        return in_reply_to_status_id_str;
    }

    public void setin_reply_to_status_id_str(Object in_reply_to_status_idStr) {
        this.in_reply_to_status_id_str = in_reply_to_status_idStr;
    }

    public Object getin_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setin_reply_to_user_id(Object in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public Object getin_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    public void setin_reply_to_user_id_str(Object in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    public Object getin_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setin_reply_to_screen_name(Object in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public Object getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public Object getContributors() {
        return contributors;
    }

    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }


    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
