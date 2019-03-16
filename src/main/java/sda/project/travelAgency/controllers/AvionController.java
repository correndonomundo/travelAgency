package sda.project.travelAgency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sda.project.travelAgency.model.Avion;
import sda.project.travelAgency.model.Hotel;
import sda.project.travelAgency.services.AvionService;

import java.util.List;

@Controller
@RequestMapping(value = "/avioane")
public class AvionController {

    @Autowired
    private AvionService avionService;

    @RequestMapping(method = RequestMethod.GET)
    public String showAvioane(Model model){
        List<Avion> avionList = avionService.getAllAvioane();
        model.addAttribute("avionList", avionList);
        model.addAttribute("reservation", new Avion());

        return "avioane/avioane_page";
    }

    @RequestMapping(value="/searchByDestination")
    public String Search(Model model, @RequestParam("searchTerm") String pSearchTerm) {
        List<Avion> avionList = avionService.searchByDestination(pSearchTerm);
        model.addAttribute("avionList",avionList);
        model.addAttribute("reservation", new Avion());

        return "avioane/avioane_page";
    }

    @RequestMapping(value="/searchByDate")
    public String Search2(Model model, @RequestParam("searchTermDate") String pSearchTerm) {
        List<Avion> avionList = avionService.searchByDate(pSearchTerm);
        model.addAttribute("avionList",avionList);
        model.addAttribute("reservation", new Avion());

        return "avioane/avioane_page";
    }

    @RequestMapping(value="/searchByStartPoint")
    public String Search3(Model model, @RequestParam("searchTermStartPoint") String pSearchTerm) {
        List<Avion> avionList = avionService.searchByStartPoint(pSearchTerm);
        model.addAttribute("avionList",avionList);
        model.addAttribute("reservation", new Avion());

        return "avioane/avioane_page";
    }

    @RequestMapping(value = "/getReservation", method = RequestMethod.POST)
    public String addAvionToUser(@ModelAttribute("reservation") Avion rezZbor, RedirectAttributes redirectAttribute){
        avionService.getReservation(rezZbor.getIdCursa(),rezZbor.getNrLocuri());
        redirectAttribute.addAttribute("locuriRezervate", rezZbor.getNrLocuri());
        redirectAttribute.addAttribute("pretTotal", rezZbor.getPrice());
        return "redirect:/avioane/getSum";
    }

    @RequestMapping(value = "/getSum", method = RequestMethod.GET)

        public String addSum(@ModelAttribute("locuriRezervate") Integer nrLocuri, @ModelAttribute("pretTotal") Double price, Model model){
            model.addAttribute("reservationTotalPrice", nrLocuri*price);

        return "avioane/avion_page_sum";
    }

}
