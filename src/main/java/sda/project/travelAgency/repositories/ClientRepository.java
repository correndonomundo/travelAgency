package sda.project.travelAgency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.project.travelAgency.model.Client;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

    public Client findTopByOrderByIdDesc();
}
