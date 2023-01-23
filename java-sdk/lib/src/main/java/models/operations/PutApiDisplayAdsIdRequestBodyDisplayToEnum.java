package .models.operations;


public enum PutApiDisplayAdsIdRequestBodyDisplayToEnum {
    ALL("all"),
    LOGGED_IN("logged_in"),
    LOGGED_OUT("logged_out");

    public final String value;

    private PutApiDisplayAdsIdRequestBodyDisplayToEnum(String value) {
        this.value = value;
    }
}
