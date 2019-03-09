package sda.project.travelAgency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        model.addAttribute("createHotel",new Hotel());
        model.addAttribute("deleteHotel", new Hotel());

        return "hotels/hotel_page";
    }

    @RequestMapping(value = "/crateH", method = RequestMethod.POST)
    public String createHotel(@ModelAttribute("createHotel") Hotel hotel){
        hotelService.createHotel(hotel.getNameHotel(), hotel.getDestination(), hotel.getPrice());

        return "redirect:/hotels";
    }

    @RequestMapping(value = "/deleteH", method = RequestMethod.POST)
    public String deleteHotel(@ModelAttribute("deleteHotel") Hotel hotel){
        hotelService.deleteHotel(hotel.getIdHotel());

        return "redirect:/hotels";
    }
}
