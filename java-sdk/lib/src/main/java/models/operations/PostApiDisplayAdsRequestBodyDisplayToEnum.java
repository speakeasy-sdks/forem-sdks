package .models.operations;


public enum PostApiDisplayAdsRequestBodyDisplayToEnum {
    ALL("all"),
    LOGGED_IN("logged_in"),
    LOGGED_OUT("logged_out");

    public final String value;

    private PostApiDisplayAdsRequestBodyDisplayToEnum(String value) {
        this.value = value;
    }
}
