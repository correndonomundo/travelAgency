package sda.project.travelAgency.services;


import sda.project.travelAgency.model.Avion;

import java.util.List;

public interface AvionService {

    public List<Avion> getAllAvioane();

    public List<Avion> searchByStartPoint(String startPoint);

    public List<Avion> searchByDestination(String destination);

    public List<Avion> searchByDate(String date);

    public Avion getReservation(int idCursa, int nrLocuri);

    public double getSum(int idCursa,int nrLocuri, double price);
}
