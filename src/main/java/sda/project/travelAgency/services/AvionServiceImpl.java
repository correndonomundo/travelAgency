package sda.project.travelAgency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.project.travelAgency.model.Avion;
import sda.project.travelAgency.model.Hotel;
import sda.project.travelAgency.repositories.AvionRepository;


import java.util.List;

@Service
public class AvionServiceImpl implements AvionService {

    @Autowired
    private AvionRepository avionRepository;

    @Override
    public List<Avion> getAllAvioane() {
        return avionRepository.findAll();
    }

    @Override
    public List<Avion> searchByStartPoint(String startPoint) {
        return  avionRepository.findAllByStartPoint(startPoint);
    }

    @Override
    public List<Avion> searchByDestination(String destination) {
        return  avionRepository.findAllByDestination(destination);
    }

    @Override
    public List<Avion> searchByDate(String date) {
        return avionRepository.findAllByDate(date);
    }

    @Override
    public Avion getAvionById(int idCursa) {
        return avionRepository.getOne(idCursa);
    }
}
