package sda.project.travelAgency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.project.travelAgency.model.RezervareHotel;

@Repository
public interface RezervareHotelRepository extends JpaRepository<RezervareHotel,Integer> {
}
