package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "quality")
public class Quality implements Serializable {


    private static final long serialVersionUID = 4554532662835017674L;

    private Long id;
    private String quality;
    private String description;
    private Set<Movie> movies = new HashSet<Movie>();

    public Quality() {
    }

    public Quality(String quality) {
        this.quality = quality;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quality_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "quality", nullable = false, unique = true)
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(mappedBy = "quality", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Quality{" +
                "quality='" + quality + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quality quality1 = (Quality) o;
        return Objects.equals(id, quality1.id) &&
                Objects.equals(quality, quality1.quality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quality);
    }
}
