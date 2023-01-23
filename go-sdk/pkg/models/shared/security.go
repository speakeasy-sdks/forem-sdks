package shared

type SchemeAPIKey struct {
	APIKey string `security:"name=api-key"`
}

type Security struct {
	APIKey SchemeAPIKey `security:"scheme,type=apiKey,subtype=header"`
}
