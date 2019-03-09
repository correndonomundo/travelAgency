package sda.project.travelAgency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sda.project.travelAgency.model.Client;
import sda.project.travelAgency.services.ClientService;
import sun.misc.Request;

import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    public String showClients(Model model){
        List<Client> list = clientService.getAllClients();
        Client lastClient = clientService.lastClient();

        model.addAttribute("clientList", list);
        model.addAttribute("createclient",new Client());
        model.addAttribute("deleteclient",new Client());
        model.addAttribute("lastClient", lastClient);
        return "clients/client_page";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createClient(@ModelAttribute("createclient") Client client){
       clientService.createClient(client.getCnp(),client.getName());

        return "redirect:/clients";
    }

//    @RequestMapping(value = "/update",method = RequestMethod.POST)
//    public String upadteClient(@ModelAttribute("updateclient") Client client){
//        clientService.updateClient(client.getId(),client.getName());
//        return "redirect:/clients";
//    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String deleteClient(@ModelAttribute("deleteclient") Client client){
        clientService.deleteClient();
        return "redirect:/clients";
    }
}
