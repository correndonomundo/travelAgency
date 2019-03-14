package sda.project.travelAgency.model;
import javax.persistence.*;

@Entity
@Table(name = "avioane")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCursa;

    @Column
    private String startPoint;

    @Column
    private String destination;

    @Column
    private String date;

    @Column
    private double price;

    @Column
    private int nrLocuri;

    public int getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(int idCursa) {
        this.idCursa = idCursa;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
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

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "idCursa=" + idCursa +
                ", startPoint='" + startPoint + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
