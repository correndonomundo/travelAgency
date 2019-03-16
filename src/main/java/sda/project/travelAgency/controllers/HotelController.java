package sda.project.travelAgency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
        model.addAttribute("reservation",new Hotel());


        return "hotels/hotel_page";
    }


    @RequestMapping(value="/searchByDestination")
    public String Search(Model model, @RequestParam("searchTerm") String pSearchTerm) {
        List<Hotel> hotelList = hotelService.searchByDestination(pSearchTerm);
        model.addAttribute("hotelList",hotelList);
        model.addAttribute("reservation",new Hotel());

        return "hotels/hotel_page";
    }

    @RequestMapping(value="/searchByName")
    public String Search2(Model model, @RequestParam("searchTermName") String pSearchTerm) {
        List<Hotel> hotelList = hotelService.searchByName(pSearchTerm);
        model.addAttribute("hotelList",hotelList);
        model.addAttribute("reservation",new Hotel());

        return "hotels/hotel_page";
    }

    @RequestMapping(value = "/getReservation", method = RequestMethod.POST)
    public String addHotelToUser(@ModelAttribute("reservation") Hotel reservation, RedirectAttributes redirectAttributes){
        hotelService.getReservation(reservation.getIdHotel(),reservation.getNrCamere());
        redirectAttributes.addAttribute("camereRezervate", reservation.getNrCamere());
        redirectAttributes.addAttribute("pretTotal", reservation.getPrice());
        return "redirect:/hotels/getSum";
    }

    @RequestMapping(value = "/getSum", method = RequestMethod.GET)
    public String addSum(@ModelAttribute("camereRezervate") Integer nrCamere, @ModelAttribute("pretTotal") Double price, Model model){
        model.addAttribute("reservationTotalPrice", nrCamere*price);

        return "hotels/hotel_page_sum";
    }


}
