package task3;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {

    private final List<Passenger> listOfPassenger = new ArrayList<>();

    public void createPassenger(final String name, final Ticket ticket) {
        Passenger passenger = new Passenger(name, ticket);
        listOfPassenger.add(passenger);
    }

    public void editPassenger(final String newName, final Ticket ticket) {
        for (Passenger p : listOfPassenger) {
            if(p.getTicket().getSeat().equals(ticket.getSeat())){
                p.setName(newName);
            }
        }
    }

    public void deletePassenger(final Passenger passenger) {
        listOfPassenger.remove(passenger);
    }
}
