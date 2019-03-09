package sda.project.travelAgency.auth.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import sda.project.travelAgency.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
