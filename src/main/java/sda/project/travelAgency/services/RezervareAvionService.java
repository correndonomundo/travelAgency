package sda.project.travelAgency.services;


import sda.project.travelAgency.auth.model.User;
import sda.project.travelAgency.model.Avion;
import sda.project.travelAgency.model.RezervareAvion;

public interface RezervareAvionService {

    RezervareAvion creazaReervareAvion(Avion avion, User user, int nrLocuri);
}
