package .models.operations;


public enum PostApiReactionsToggleCategoryEnum {
    LIKE("like"),
    READINGLIST("readinglist"),
    UNICORN("unicorn");

    public final String value;

    private PostApiReactionsToggleCategoryEnum(String value) {
        this.value = value;
    }
}
