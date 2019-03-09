package sda.project.travelAgency.services;

import sda.project.travelAgency.model.Hotel;

import java.util.List;

public interface HotelService {

    public List<Hotel> getAllHotels();

    public Hotel createHotel(String nameHotel, String destination, double price);

    public void deleteHotel(int id);
}
