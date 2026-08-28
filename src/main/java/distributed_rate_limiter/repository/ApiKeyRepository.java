package distributed_rate_limiter.repository;

import distributed_rate_limiter.entity.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ApiKeyRepository extends JpaRepository<ApiKey, Long> {
    Optional<ApiKey> findByKeyValue(String keyValue);
}