package sda.project.travelAgency.services;

import sda.project.travelAgency.model.Hotel;

import java.util.List;

public interface HotelService {

    public List<Hotel> getAllHotels();

    public List<Hotel> searchByDestination(String destination);

    public List<Hotel> searchByName(String nameHotel);

    public Hotel getReservation(int idHotel, int nrCamere);


}
