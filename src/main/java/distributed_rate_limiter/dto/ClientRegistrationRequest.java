package distributed_rate_limiter.dto;

public class ClientRegistrationRequest {

    private String name;
    private String tier;

    public ClientRegistrationRequest() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTier() { return tier; }
    public void setTier(String tier) { this.tier = tier; }
}