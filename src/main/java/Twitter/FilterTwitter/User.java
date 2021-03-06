package Twitter.FilterTwitter;

import java.util.HashMap;
import java.util.Map;

public class User {

    private String id;
    private String id_str;
    private String name;
    private String screen_name;
    private String location;
    private String description;
    private String url;
    private Entities_ entities;
    private Boolean _protected;
    private Integer followers_count;
    private Integer friends_count;
    private Integer listed_count;
    private String created_at;
    private Integer favourites_count;
    private Integer utc_offset;
    private String time_zone;
    private Boolean geo_enabled;
    private Boolean verified;
    private Integer statuses_count;

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public Boolean getGeo_enabled() {
        return geo_enabled;
    }

    public void setGeo_enabled(Boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Integer getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(Integer statuses_count) {
        this.statuses_count = statuses_count;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getContributors_enabled() {
        return contributors_enabled;
    }

    public void setContributors_enabled(Boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    public Boolean getIs_translator() {
        return is_translator;
    }

    public void setIs_translator(Boolean is_translator) {
        this.is_translator = is_translator;
    }

    public Boolean getIs_translation_enabled() {
        return is_translation_enabled;
    }

    public void setIs_translation_enabled(Boolean is_translation_enabled) {
        this.is_translation_enabled = is_translation_enabled;
    }

    public String getProfile_background_color() {
        return profile_background_color;
    }

    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }

    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }

    public Boolean getProfile_background_tile() {
        return profile_background_tile;
    }

    public void setProfile_background_tile(Boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    public String getProfile_link_color() {
        return profile_link_color;
    }

    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    public String getProfile_text_color() {
        return profile_text_color;
    }

    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    public Boolean getProfile_use_background_image() {
        return profile_use_background_image;
    }

    public void setProfile_use_background_image(Boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }

    public Boolean getHas_extended_profile() {
        return has_extended_profile;
    }

    public void setHas_extended_profile(Boolean has_extended_profile) {
        this.has_extended_profile = has_extended_profile;
    }

    public Boolean getDefault_profile() {
        return default_profile;
    }

    public void setDefault_profile(Boolean default_profile) {
        this.default_profile = default_profile;
    }

    public Boolean getDefault_profile_image() {
        return default_profile_image;
    }

    public void setDefault_profile_image(Boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getFollow_request_sent() {
        return follow_request_sent;
    }

    public void setFollow_request_sent(Boolean follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }

    public Boolean getNotifications() {
        return notifications;
    }

    public void setNotifications(Boolean notifications) {
        this.notifications = notifications;
    }

    public String getTranslator_type() {
        return translator_type;
    }

    public void setTranslator_type(String translator_type) {
        this.translator_type = translator_type;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    private String lang;
    private Boolean contributors_enabled;
    private Boolean is_translator;
    private Boolean is_translation_enabled;
    private String profile_background_color;
    private String profile_background_image_url;
    private String profile_background_image_url_https;
    private Boolean profile_background_tile;
    private String profile_image_url;
    private String profile_image_url_https;
    private String profile_link_color;
    private String profile_sidebar_border_color;
    private String profile_sidebar_fill_color;
    private String profile_text_color;
    private Boolean profile_use_background_image;
    private Boolean has_extended_profile;
    private Boolean default_profile;
    private Boolean default_profile_image;
    private Boolean following;
    private Boolean follow_request_sent;
    private Boolean notifications;
    private String translator_type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getscreen_name() {
        return screen_name;
    }

    public void setscreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Entities_ getEntities() {
        return entities;
    }

    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public Integer getfollowers_count() {
        return followers_count;
    }

    public void setfollowers_count(Integer followers_count) {
        this.followers_count = followers_count;
    }

    public Integer getfriends_count() {
        return friends_count;
    }

    public void setfriends_count(Integer friends_count) {
        this.friends_count = friends_count;
    }

    public Integer getlisted_count() {
        return listed_count;
    }

    public void setlisted_count(Integer listed_count) {
        this.listed_count = listed_count;
    }

    public String getcreated_at() {
        return created_at;
    }

    public void setcreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Integer getfavourites_count() {
        return favourites_count;
    }

    public void setfavourites_count(Integer favourites_count) {
        this.favourites_count = favourites_count;
    }

    public Integer getUtcOffset() {
        return utc_offset;
    }

    public void setutc_offset(Integer utc_offset) {
        this.utc_offset = utc_offset;
    }



}
