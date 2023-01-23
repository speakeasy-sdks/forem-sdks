package .models.operations;


public enum PostApiReactionsCategoryEnum {
    LIKE("like"),
    READINGLIST("readinglist"),
    UNICORN("unicorn");

    public final String value;

    private PostApiReactionsCategoryEnum(String value) {
        this.value = value;
    }
}
