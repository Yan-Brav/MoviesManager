package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "codec")
public class Codec implements Serializable {

    private static final long serialVersionUID = 8320289868746506965L;

    private Long id;
    private String type;
    private Set<Movie> movies = new HashSet<Movie>();

    public Codec() {
    }

    public Codec(String type) {
        this.type = type;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codec_id")
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
    @OneToMany(mappedBy = "codec_id", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Codec{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Codec codec = (Codec) o;
        return Objects.equals(id, codec.id) &&
                Objects.equals(type, codec.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}
