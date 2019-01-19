package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "format_video")
public class FormatVideo implements Serializable {


    private static final long serialVersionUID = -5196738960916094183L;

    private Long id;
    private String type;
    private Set<Movie> movies = new HashSet<Movie>();

    public FormatVideo() {
    }

    public FormatVideo(String type) {
        this.type = type;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "format_video_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @ManyToMany
    @JoinTable(name = "movie_format_video", joinColumns = @JoinColumn(name = "format_video_id"),
               inverseJoinColumns = @JoinColumn(name = "movie_id"))
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "FormatVideo{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormatVideo that = (FormatVideo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}
