package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "basis")
public class Basis implements Serializable {


    private static final long serialVersionUID = -6900367646697928226L;

    private Long id;
    private String type;
    private Set<Disk> disks = new HashSet<Disk>();

    public Basis() {
    }

    public Basis(String type) {
        this.type = type;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basis_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "type", nullable = false, unique = true)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @OneToMany(mappedBy = "basis_id", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Disk> getDisks() {
        return disks;
    }

    public void setDisks(Set<Disk> disks) {
        this.disks = disks;
    }

    @Override
    public String toString() {
        return "Basis{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basis basis = (Basis) o;
        return Objects.equals(id, basis.id) &&
                Objects.equals(type, basis.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}
