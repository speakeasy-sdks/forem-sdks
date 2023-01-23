package .models.operations;


public enum PostApiReactionsToggleReactableTypeEnum {
    COMMENT("Comment"),
    ARTICLE("Article"),
    USER("User");

    public final String value;

    private PostApiReactionsToggleReactableTypeEnum(String value) {
        this.value = value;
    }
}
