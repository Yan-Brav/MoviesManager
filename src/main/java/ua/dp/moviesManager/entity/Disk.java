package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "disk")
public class Disk implements Serializable {


    private static final long serialVersionUID = 8518361448461466941L;

    private Long id;
    private String number;
    private Basis basis;
    private Box box;

    public Disk() {
    }

    public Disk(String number) {
        this.number = number;
    }

    public Disk(String number, Box box) {
        this.number = number;
        this.box = box;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disk_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "disk_number", nullable = false, unique = true)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
//    @Column(name = "basis_id")
    @ManyToOne
    @JoinColumn(name = "basis_id")
    public Basis getBasis() {
        return this.basis;
    }

    public void setBasis(Basis basis) {
        this.basis = basis;
    }
//    @Column(name = "box_id", nullable = false)
    @ManyToOne
    @JoinColumn(name = "box_id")
    public Box getBox() {
        return this.box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disk disk = (Disk) o;
        return Objects.equals(id, disk.id) &&
                Objects.equals(number, disk.number) &&
                Objects.equals(basis, disk.basis) &&
                Objects.equals(box, disk.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, basis, box);
    }
}
