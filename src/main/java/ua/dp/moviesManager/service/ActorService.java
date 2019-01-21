package ua.dp.moviesManager.service;

import ua.dp.moviesManager.entity.Actor;
import ua.dp.moviesManager.entity.Movie;

import java.util.List;

public interface ActorService {

    List<Actor> findAll();
    Actor findById(Long id);
    Actor findByLastName(String lastName);
    List<Actor> findByMovie(Movie movie);
    Actor createOrUpdate(Actor actor);
    void delete(Actor actor);
}
