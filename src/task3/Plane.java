package task3;

public class Plane {
    private Integer planeId;
    private String model;
    private int capacity;

    public Plane(Integer planeId, String model) {
        this.planeId = planeId;
        this.model = model;
    }

    public Integer getPlaneId() {
        return planeId;
    }
    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeId=" + planeId +
                ", model='" + model + '\'' +
                '}';
    }
}
