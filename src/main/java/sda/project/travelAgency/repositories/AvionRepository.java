package sda.project.travelAgency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sda.project.travelAgency.model.Avion;
import sda.project.travelAgency.model.Hotel;

import java.util.List;

@Repository
public interface AvionRepository extends JpaRepository<Avion,Integer> {

    public List<Avion> findAllByDestination (@Param("destination") String destination);


    public List<Avion> findAllByStartPoint(@Param("startPoint") String startPoint);

    public List<Avion> findAllByDate(@Param("date") String date);
}
