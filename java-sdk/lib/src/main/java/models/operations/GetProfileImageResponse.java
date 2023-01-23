package .models.operations;


public class GetProfileImageResponse {
    public String contentType;
    public GetProfileImageResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetProfileImageResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public java.util.Map<String, Object> getProfileImage200ApplicationJSONObject;
    public GetProfileImageResponse withGetProfileImage200ApplicationJsonObject(java.util.Map<String, Object> getProfileImage200ApplicationJSONObject) {
        this.getProfileImage200ApplicationJSONObject = getProfileImage200ApplicationJSONObject;
        return this;
    }
}