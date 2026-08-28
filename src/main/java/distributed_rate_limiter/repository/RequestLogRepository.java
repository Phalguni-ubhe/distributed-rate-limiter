package distributed_rate_limiter.repository;

import distributed_rate_limiter.entity.RequestLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestLogRepository extends JpaRepository<RequestLog, Long> {
}