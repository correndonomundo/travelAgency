package sda.project.travelAgency.model;

import sda.project.travelAgency.auth.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue
    private int idHotel;

    @Column
    private String nameHotel;

    @Column
    private String destination;

    @Column
    private double price;

    @Column
    private int nrCamere;

    @OneToMany(mappedBy = "hotel")
    private List<User> users;

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", nameHotel='" + nameHotel + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", nrCamere=" + nrCamere +
                '}';
    }
}
