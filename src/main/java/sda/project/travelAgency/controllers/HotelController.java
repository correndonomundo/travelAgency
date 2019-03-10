package sda.project.travelAgency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sda.project.travelAgency.model.Hotel;
import sda.project.travelAgency.services.HotelService;

import java.util.List;

@Controller
@RequestMapping(value = "/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping(method = RequestMethod.GET)
    public String showHotels(Model model){
        List<Hotel> hotelList = hotelService.getAllHotels();
        model.addAttribute("hotelList",hotelList);
        model.addAttribute("searchD", new Hotel());
        model.addAttribute("searchN", new Hotel());

        return "hotels/hotel_page";
    }

    @RequestMapping(value = "/searchByDestination", method = RequestMethod.POST)
    public String searchByDestination(@ModelAttribute("searchD") Hotel hotel){
        hotelService.searchByDestination(hotel.getDestination());
        return "redirect:/hotels";
    }

    @RequestMapping(value = "/searchByName", method = RequestMethod.POST)
    public String searchByName(@ModelAttribute("searchN") Hotel hotel){
//        hotelService.searchByName(hotel.getNameHotel());
        return "redirect:/hotels";
    }
}
