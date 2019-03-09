package sda.project.travelAgency.services;

import sda.project.travelAgency.model.Client;

import java.util.List;

public interface ClientService {

    public List<Client> getAllClients();

    public Client lastClient();

    public Client createClient(String cnp, String name);

    public void updateClient(int id,String name);

    public void deleteClient();
}
