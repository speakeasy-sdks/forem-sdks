package .models.shared;

import .utils.SpeakeasyMetadata;
public class SchemeApiKey {
    @SpeakeasyMetadata("security:name=api-key")
    public String apiKey;
    public SchemeApiKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}