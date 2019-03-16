package sda.project.travelAgency.model;

import sda.project.travelAgency.auth.model.User;

import javax.persistence.*;

@Entity
@Table(name = "rezervare_hotel")
public class RezervareHotel {

    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    @JoinColumn(name = "id_hotel")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
