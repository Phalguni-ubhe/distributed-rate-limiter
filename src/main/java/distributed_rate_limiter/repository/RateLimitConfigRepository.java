package distributed_rate_limiter.repository;

import distributed_rate_limiter.entity.RateLimitConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RateLimitConfigRepository extends JpaRepository<RateLimitConfig, Long> {
    Optional<RateLimitConfig> findByTier(String tier);
}