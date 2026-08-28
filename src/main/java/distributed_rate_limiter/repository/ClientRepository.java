package distributed_rate_limiter.repository;

import distributed_rate_limiter.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}