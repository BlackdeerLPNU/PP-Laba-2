package task3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {
    private Airport from;
    private Airport to;
    private Plane plane;
    private int numberOfFlight;
    private LocalDateTime date;

    public Flight(Airport from, Airport to, Plane plane, int numberOfFlight, LocalDateTime date) {
        this.from = from;
        this.to = to;
        this.plane = plane;
        this.numberOfFlight = numberOfFlight;
        this.date = date;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from=" + from +
                ", to=" + to +
                ", plane=" + plane +
                ", numberOfFlight=" + numberOfFlight +
                ", date=" + date +
                '}';
    }
}
