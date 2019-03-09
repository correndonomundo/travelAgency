package sda.project.travelAgency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.project.travelAgency.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {
}
