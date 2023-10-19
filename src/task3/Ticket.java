package task3;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {
    private Flight flight;
    private double price;
    private String seat;

    public Ticket(Flight flight, double price, String seat) {
        this.flight = flight;
        this.price = price;
        this.seat = seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
