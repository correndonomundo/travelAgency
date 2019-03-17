package sda.project.travelAgency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.project.travelAgency.auth.model.User;
import sda.project.travelAgency.auth.repositories.UserRepository;
import sda.project.travelAgency.model.Avion;
import sda.project.travelAgency.model.RezervareAvion;
import sda.project.travelAgency.repositories.AvionRepository;
import sda.project.travelAgency.repositories.RezervareAvionRepository;

@Service
public class RezervareAvionServiceImpl implements RezervareAvionService {

    @Autowired
    private AvionRepository avionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RezervareAvionRepository rezervareAvionRepository;

    @Override
    public RezervareAvion creazaReervareAvion(Avion avion, User user, int nrLocuri) {
        RezervareAvion rezervareAvion = new RezervareAvion();

        Avion av = avionRepository.findById(avion.getIdCursa()).get();
        User us = userRepository.findByUsername(user.getUsername());

        rezervareAvion.setAvion(av);
        rezervareAvion.setUser(us);
        rezervareAvion.setNrLocuri(nrLocuri);
        rezervareAvion.setPret(nrLocuri*av.getPrice());

        av.setNrLocuri(avion.getNrLocuri()-nrLocuri);
        avionRepository.save(av);

        return rezervareAvionRepository.save(rezervareAvion);
    }
}
