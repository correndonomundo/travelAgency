package sda.project.travelAgency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.project.travelAgency.model.Client;
import sda.project.travelAgency.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client lastClient(){
        return clientRepository.findTopByOrderByIdDesc();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client createClient(String cnp, String name) {
        Client client = new Client();
        client.setCnp(cnp);
        client.setName(name);
        return clientRepository.save(client);
    }

    @Override
    public void updateClient(int id,String name) {
        Client cl = clientRepository.getOne(id);
        cl.setName(name);
        clientRepository.save(cl);
    }

    @Override
    public void deleteClient() {
        Client cl = clientRepository.findTopByOrderByIdDesc();
        clientRepository.deleteById(cl.getId());

    }
}
