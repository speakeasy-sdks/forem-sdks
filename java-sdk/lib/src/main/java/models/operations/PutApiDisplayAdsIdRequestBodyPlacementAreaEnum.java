package .models.operations;


public enum PutApiDisplayAdsIdRequestBodyPlacementAreaEnum {
    SIDEBAR_LEFT("sidebar_left"),
    SIDEBAR_LEFT2("sidebar_left_2"),
    SIDEBAR_RIGHT("sidebar_right"),
    POST_SIDEBAR("post_sidebar"),
    POST_COMMENTS("post_comments");

    public final String value;

    private PutApiDisplayAdsIdRequestBodyPlacementAreaEnum(String value) {
        this.value = value;
    }
}
