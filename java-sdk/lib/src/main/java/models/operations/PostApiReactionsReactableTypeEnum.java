package .models.operations;


public enum PostApiReactionsReactableTypeEnum {
    COMMENT("Comment"),
    ARTICLE("Article"),
    USER("User");

    public final String value;

    private PostApiReactionsReactableTypeEnum(String value) {
        this.value = value;
    }
}
