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
    public void searchByDestination(String destination) {
        hotelRepository.findAllByDestination(destination);
    }

    @Override
    public void searchByName(String nameHotel) {
          hotelRepository.findAllByNameHotel(nameHotel);
    }
}
