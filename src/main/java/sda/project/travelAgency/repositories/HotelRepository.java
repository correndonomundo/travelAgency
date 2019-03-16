package sda.project.travelAgency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sda.project.travelAgency.model.Hotel;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {

    public List<Hotel> findAllByDestination (@Param("destination") String destination);


    public List<Hotel> findAllByNameHotel(@Param("nameHotel") String nameHotel);



}
