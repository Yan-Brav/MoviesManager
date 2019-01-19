package ua.dp.moviesManager.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {


    private static final long serialVersionUID = 5645573999949545270L;

    private Long id;
    private String title;
    private Integer publicationYear;
    private Integer duration;
    private String description;
    private Long codec;
    private Long genre;
    private Long quality;
    private Set<Actor> actors = new HashSet<Actor>();
    private Set<Director> directors = new HashSet<Director>();
    private Set<Disk> disks = new HashSet<Disk>();
    private Set<FormatVideo> formats = new HashSet<FormatVideo>();

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, Integer publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    @Column(name = "title", nullable = false)
    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "publication_year")
    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Column(name = "duration")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "codec_id")
    public Long getCodec() {
        return codec;
    }

    public void setCodec(Long codec) {
        this.codec = codec;
    }
    @Column(name = "genre_id")
    public Long getGenre() {
        return genre;
    }

    public void setGenre(Long genre) {
        this.genre = genre;
    }
    @Column(name = "quality_id")
    public Long getQuality() {
        return quality;
    }

    public void setQuality(Long quality) {
        this.quality = quality;
    }
    @ManyToMany
    @JoinTable(name = "movie_actor", joinColumns = @JoinColumn(name = "movie_id"),
                inverseJoinColumns = @JoinColumn(name = "actor_id"))
    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }
    @ManyToMany
    @JoinTable(name = "movie_director", joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id"))
    public Set<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<Director> directors) {
        this.directors = directors;
    }
    @ManyToMany
    @JoinTable(name = "movie_disk", joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "disk_id"))
    public Set<Disk> getDisks() {
        return disks;
    }

    public void setDisks(Set<Disk> disks) {
        this.disks = disks;
    }
    @ManyToMany
    @JoinTable(name = "movie_format_video", joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "format_video_id"))
    public Set<FormatVideo> getFormats() {
        return formats;
    }

    public void setFormats(Set<FormatVideo> formats) {
        this.formats = formats;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) &&
                Objects.equals(title, movie.title) &&
                Objects.equals(publicationYear, movie.publicationYear) &&
                Objects.equals(duration, movie.duration) &&
                Objects.equals(codec, movie.codec) &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(quality, movie.quality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, publicationYear, duration, codec, genre, quality);
    }
}
