package task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private final List<Airport> listOfAirports = new ArrayList<>();
    private final List<Passenger> listOfPassenger = new ArrayList<>();
    private final List<Plane> listOfPlanes = new ArrayList<>();
    private final List<Ticket> tickets = new ArrayList<>();
    private final List<Flight> flightSchedule = new ArrayList<>();

    public void createAirport(final Airport airport) {

        listOfAirports.add(airport);
    }

    public void editAirport(final int id, final String place, final String newName) {
        for (Airport airport : listOfAirports) {
            if (airport.getId() == id) {
                airport.setName(newName);
            }
        }
    }

    public void deleteAirport(final Integer id) {
        listOfAirports.removeIf(airport -> airport.getId().equals(id));
    }


    public void createPassenger(final Passenger passenger) {

        listOfPassenger.add(passenger);
    }

    public void editPassenger(final String newName, final Ticket ticket) {
        for (Passenger p : listOfPassenger) {
            if (p.getTicket().getSeat().equals(ticket.getSeat())) {
                p.setName(newName);
            }
        }
    }

    public void deletePassenger(final Passenger passenger) {
        listOfPassenger.remove(passenger);
    }


    public void createPlane(final Plane plane) {

        listOfPlanes.add(plane);
    }

    public void editPlane(final int planeId, final String newModel) {
        for (Plane plane : listOfPlanes) {
            if (plane.getPlaneId() == planeId) plane.setModel(newModel);
        }
    }

    public void deletePlane(final Integer planeId) {
        listOfPlanes.removeIf(plane -> plane.getPlaneId().equals(planeId));
    }


    public void sellTicket(final Ticket ticket) {

        tickets.add(ticket);
    }

    public void cancelTicket(final int numberofFlight, final String seat) {
        for (Ticket t : tickets) {
            if (t.getFlight().getNumberOfFlight() == numberofFlight &&
                    t.getSeat().equals(seat)) {
                tickets.remove(t);
            }
        }
    }

    public void earningsForTime(final LocalDateTime start, final LocalDateTime finish) {
        double incom = 0;
        for (Ticket t : tickets) {
            if (t.getFlight().getDate().isAfter(start) && t.getFlight().getDate().isBefore(finish))
                incom += t.getPrice();
        }
        System.out.println("Income for the period " + incom);
    }


    public List<Flight> getFlightSchedule() {
        return flightSchedule;
    }

    public void createFligh(final Flight flight) {
        flightSchedule.add(flight);
    }

    public void editFligth(final Airport fromNewAirport, final Airport toNewAirport, final Plane newPlane, final int numberOfFlight) {
        for (Flight flight : flightSchedule) {
            if (flight.getNumberOfFlight() == numberOfFlight) {
                flight.setFrom(fromNewAirport);
                flight.setTo(toNewAirport);
                flight.setPlane(newPlane);
            }
        }
    }

    public void deleteFlight(final int numberOfFlight) {
        flightSchedule.removeIf(flight -> flight.getNumberOfFlight() == numberOfFlight);
    }

    public void printFlightSchedule() {
        System.out.println("Flight Schedule:");
        for (Flight flight : flightSchedule) {
            System.out.println("Number flight " + flight.getNumberOfFlight() + " From " + flight.getFrom() + " To " + flight.getTo());
        }
    }
}
