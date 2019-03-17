package sda.project.travelAgency.auth.model;

import sda.project.travelAgency.model.RezervareAvion;
import sda.project.travelAgency.model.RezervareHotel;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;


    @OneToMany(mappedBy = "user")
    private List<RezervareHotel> rezervareHotels;

    @OneToMany(mappedBy = "user")
    private List<RezervareAvion> rezervareAvioane;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }


    public List<RezervareHotel> getRezervareHotels() {
        return rezervareHotels;
    }

    public void setRezervareHotels(List<RezervareHotel> rezervareHotels) {
        this.rezervareHotels = rezervareHotels;
    }

    public List<RezervareAvion> getRezervareAvioane() {
        return rezervareAvioane;
    }

    public void setRezervareAvioane(List<RezervareAvion> rezervareAvioane) {
        this.rezervareAvioane = rezervareAvioane;
    }
}