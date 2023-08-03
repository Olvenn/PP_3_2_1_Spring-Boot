package springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBoot.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
