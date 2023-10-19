package task3;

public class Airport {
    private Integer id;
    private String place;
    private String name;

    public Airport(int id, String place, String name) {
        this.id = id;
        this.place = place;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getPlace();
    }
}
