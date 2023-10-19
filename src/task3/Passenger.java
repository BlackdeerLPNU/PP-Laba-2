package task3;

public class Passenger {
    private String name;
    private Ticket ticket;


    public Passenger(String name, Ticket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
