package sda.project.travelAgency.services;

import sda.project.travelAgency.model.Hotel;

import java.util.List;

public interface HotelService {

    public List<Hotel> getAllHotels();

    public void searchByDestination(String destination);

    public void searchByName(String nameHotel);

}
