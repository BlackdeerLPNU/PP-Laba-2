package task3;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Airport airport1 = new Airport(0, "Lviv", "blabla");
        Airport airport2 = new Airport(1, "Kyiv", "mhhh");
        Airport airport3 = new Airport(2, "Varshava", "dzien");

        Plane plane1 = new Plane(0, "Boeing1");
        Plane plane2 = new Plane(2, "Boeing2");

        Flight flight1 = new Flight(airport1, airport2, plane1, 1,
                LocalDateTime.of(2020, Month.OCTOBER, 17, 13, 00));

        Flight flight2 = new Flight(airport2, airport1, plane2, 2,
                LocalDateTime.of(2020, Month.OCTOBER, 20, 13, 00));

        Flight flight3 = new Flight(airport3, airport2, plane1, 3,
                LocalDateTime.of(2020, Month.OCTOBER, 20, 13, 00));

        Ticket ticket1 = new Ticket(flight1, 1000, "37A");
        Ticket ticket2 = new Ticket(flight2, 1000, "17B");

        Passenger passenger1 = new Passenger("Vova", ticket1);
        Passenger passenger2 = new Passenger("Sasha", ticket2);

        Company company = new Company();

        company.createAirport(airport1);
        company.createAirport(airport2);

        company.createPassenger(passenger1);
        company.createPassenger(passenger2);

        company.createPlane(plane1);
        company.createPlane(plane2);

        company.createFligh(flight2);
        company.createFligh(flight1);
        company.createFligh(flight3);

        company.sellTicket(ticket1);
        company.sellTicket(ticket2);

        company.deletePassenger(passenger2);
        company.editFligth(airport1, airport3, plane2, 2);

        company.printFlightSchedule();
        company.earningsForTime( LocalDateTime.of(2019, Month.OCTOBER, 17, 13, 00),
                LocalDateTime.of(2023, Month.OCTOBER, 20, 13, 00));

    }
}
