package distributed_rate_limiter.dto;

public class ClientRegistrationResponse {

    private Long clientId;
    private String apiKey;
    private String jwtToken;

    public ClientRegistrationResponse(Long clientId, String apiKey, String jwtToken) {
        this.clientId = clientId;
        this.apiKey = apiKey;
        this.jwtToken = jwtToken;
    }

    public Long getClientId() { return clientId; }
    public String getApiKey() { return apiKey; }
    public String getJwtToken() { return jwtToken; }
}