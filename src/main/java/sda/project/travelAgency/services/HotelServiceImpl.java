package sda.project.travelAgency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.project.travelAgency.model.Hotel;
import sda.project.travelAgency.repositories.HotelRepository;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel createHotel(String nameHotel, String destination, double price) {
        Hotel hotel = new Hotel();
        hotel.setNameHotel(nameHotel);
        hotel.setDestination(destination);
        hotel.setPrice(price);
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(int id) {
        hotelRepository.deleteById(id);
    }
}
