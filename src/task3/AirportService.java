package task3;

import java.util.ArrayList;
import java.util.List;

public abstract class AirportService {
    private final List<Airport> listOfAirports = new ArrayList<>();
    public void createAirport(final int id, final String place, final String name) {
        Airport airport = new Airport(id, place, name);
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
}
