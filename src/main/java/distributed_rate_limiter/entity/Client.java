package distributed_rate_limiter.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String tier; // e.g. "FREE", "PRO"

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    public Client() {}

    public Client(String name, String tier) {
        this.name = name;
        this.tier = tier;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTier() { return tier; }
    public void setTier(String tier) { this.tier = tier; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}