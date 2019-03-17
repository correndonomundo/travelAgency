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
    public RezervareHotel creazaRezervare(Hotel hotel, User user, int nrCamere){
        RezervareHotel rezervare = new RezervareHotel();
        Hotel h = hotelRepository.findById(hotel.getId()).get();
        User u = userRepository.findByUsername(user.getUsername());

        rezervare.setHotel(h);
        rezervare.setUser(u);
        rezervare.setNrCamere(nrCamere);
        rezervare.setPret(nrCamere*h.getPrice());

        h.setNrCamere(h.getNrCamere() - nrCamere);
        hotelRepository.save(h);

        return rezervareHotelRepository.save(rezervare);
    }
}
