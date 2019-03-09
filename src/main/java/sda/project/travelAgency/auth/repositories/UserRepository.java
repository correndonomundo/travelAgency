package sda.project.travelAgency.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.project.travelAgency.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
