package sda.project.travelAgency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.project.travelAgency.auth.model.User;
import sda.project.travelAgency.auth.repositories.UserRepository;
import sda.project.travelAgency.model.Hotel;
import sda.project.travelAgency.model.RezervareHotel;
import sda.project.travelAgency.repositories.HotelRepository;
import sda.project.travelAgency.repositories.RezervareHotelRepository;

@Service
public class RezervareHotelServiceImpl implements RezervareHotelService{

    @Autowired
    private RezervareHotelRepository rezervareHotelRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public RezervareHotel salvareBd(Hotel hotel, User user){
        RezervareHotel rezervare = new RezervareHotel();
        Hotel h = hotelRepository.findById(hotel.getIdHotel()).get();
        User u = userRepository.findByUsername(user.getUsername());
        rezervare.setHotel(h);
        rezervare.setUser(u);
        return rezervareHotelRepository.save(rezervare);
    }
}
