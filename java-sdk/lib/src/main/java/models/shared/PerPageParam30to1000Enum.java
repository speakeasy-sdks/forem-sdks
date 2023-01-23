package .models.shared;


public enum PerPageParam30to1000Enum {
    FRESH("fresh"),
    RISING("rising"),
    ALL("all");

    public final String value;

    private PerPageParam30to1000Enum(String value) {
        this.value = value;
    }
}
