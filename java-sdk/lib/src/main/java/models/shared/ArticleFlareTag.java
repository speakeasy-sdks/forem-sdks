package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ArticleFlareTag
 * Flare tag of the article
**/public class ArticleFlareTag {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bg_color_hex")
    public String bgColorHex;
    public ArticleFlareTag withBgColorHex(String bgColorHex) {
        this.bgColorHex = bgColorHex;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public ArticleFlareTag withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_color_hex")
    public String textColorHex;
    public ArticleFlareTag withTextColorHex(String textColorHex) {
        this.textColorHex = textColorHex;
        return this;
    }
}