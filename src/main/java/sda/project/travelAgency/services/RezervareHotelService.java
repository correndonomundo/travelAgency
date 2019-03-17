package sda.project.travelAgency.services;

import sda.project.travelAgency.auth.model.User;
import sda.project.travelAgency.model.Hotel;
import sda.project.travelAgency.model.RezervareHotel;

public interface RezervareHotelService {
    RezervareHotel creazaRezervare(Hotel hotel, User user, int nrCamere);
}
