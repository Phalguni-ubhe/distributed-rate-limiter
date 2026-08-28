package distributed_rate_limiter.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rate_limit_configs")
public class RateLimitConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String tier; // e.g. "FREE", "PRO" — matches Client.tier

    @Column(name = "requests_per_minute", nullable = false)
    private int requestsPerMinute;

    public RateLimitConfig() {}

    public RateLimitConfig(String tier, int requestsPerMinute) {
        this.tier = tier;
        this.requestsPerMinute = requestsPerMinute;
    }

    public Long getId() { return id; }
    public String getTier() { return tier; }
    public void setTier(String tier) { this.tier = tier; }
    public int getRequestsPerMinute() { return requestsPerMinute; }
    public void setRequestsPerMinute(int requestsPerMinute) { this.requestsPerMinute = requestsPerMinute; }
}