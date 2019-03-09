package sda.project.travelAgency.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String cnp;

    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getId() == client.getId() &&
                Objects.equals(getCnp(), client.getCnp()) &&
                Objects.equals(getName(), client.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getCnp(), getName());
    }
}
