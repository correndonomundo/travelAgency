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
    public Avion getReservation(int idCursa, int nrLocuri) {
        Avion avion = avionRepository.getOne(idCursa);
        avion.setNrLocuri(avion.getNrLocuri()-nrLocuri);

        return avionRepository.save(avion);
    }

    @Override
    public double getSum(int idCursa,int nrlocuri, double price) {
        Avion avion = avionRepository.getOne(idCursa);
        AvionService avionService = new AvionServiceImpl();
        Avion av = avionService.getReservation(avion.getIdCursa(),avion.getNrLocuri());
        double pretRezervareAvion = av.getNrLocuri() * avion.getPrice();

        return pretRezervareAvion;

    }
}
