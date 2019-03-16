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
    public List<Hotel> searchByDestination(String destination) {
        return  hotelRepository.findAllByDestination(destination);
    }

    @Override
    public List<Hotel> searchByName(String nameHotel) {
          return hotelRepository.findAllByNameHotel(nameHotel);
    }

    @Override
    public Hotel getReservation(int idHotel, int nrCamere) {
        Hotel hotel = hotelRepository.getOne(idHotel);
        hotel.setNrCamere(hotel.getNrCamere() - nrCamere);

        return hotelRepository.save(hotel);
    }

}
