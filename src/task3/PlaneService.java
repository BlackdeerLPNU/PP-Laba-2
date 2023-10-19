package task3;

import java.util.ArrayList;
import java.util.List;

public class PlaneService {
    private final List<Plane> listOfPlanes = new ArrayList<>();

    public void createPlane(final int planeId, final String model) {
        Plane plane = new Plane(planeId, model);
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

}
