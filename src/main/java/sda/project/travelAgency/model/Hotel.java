package sda.project.travelAgency.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private List<RezervareHotel> rezervariHotel;

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

    public List<RezervareHotel> getRezervariHotel() {
        return rezervariHotel;
    }

    public void setRezervariHotel(List<RezervareHotel> rezervariHotel) {
        this.rezervariHotel = rezervariHotel;
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
