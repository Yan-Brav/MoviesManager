package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "box")
public class Box implements Serializable {

    private static final long serialVersionUID = 4555539855725559548L;

    private Long id;
    private Integer number;
    private String title;
    private Integer capacity;
    private Location location;
    private Integer emptyCells;
    private String description;
    private Set<Disk> disks = new HashSet<Disk>();

    public Box() {
    }

    public Box(Integer number) {
        this.number = number;
    }

    public Box(Integer number, String title) {
        this.number = number;
        this.title = title;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "box_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "box_number", nullable = false, unique = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "capacity", nullable = false)
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
//    @Column(name = "location_id", nullable = false)
    @ManyToOne
    @JoinColumn(name = "location_id")
    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    @Column(name = "empty_cells")
    public Integer getEmptyCells() {
        return emptyCells;
    }

    public void setEmptyCells(Integer emptyCells) {
        this.emptyCells = emptyCells;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(mappedBy = "box", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Disk> getDisks() {
        return disks;
    }

    public void setDisks(Set<Disk> disks) {
        this.disks = disks;
    }

    @Override
    public String toString() {
        return "Box{" +
                "number=" + number +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(id, box.id) &&
                Objects.equals(number, box.number) &&
                Objects.equals(title, box.title) &&
                Objects.equals(capacity, box.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, title, capacity);
    }
}
