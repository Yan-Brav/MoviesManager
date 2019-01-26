package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "location")
public class Location implements Serializable {


    private static final long serialVersionUID = 1115013973356192626L;

    private Long id;
    private String place;
    private String description;
    private Set<Box> boxes = new HashSet<Box>();

    public Location() {
    }

    public Location(String place) {
        this.place = place;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "place", nullable = false)
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(Set<Box> boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "Location{" +
                "place='" + place + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(id, location.id) &&
                Objects.equals(place, location.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, place);
    }
}
