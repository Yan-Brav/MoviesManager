package ua.dp.moviesManager.service;

import com.google.common.collect.Lists;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.dp.moviesManager.entity.Actor;
import ua.dp.moviesManager.entity.Movie;
import ua.dp.moviesManager.repository.ActorRepository;

import java.util.List;

@Repository
@Transactional
@Service("actorService")
public class ActorServiceImpl implements ActorService {

    private ActorRepository actorRepository;
    private String expectedName;

    @Override
    @Transactional(readOnly = true)
    public List<Actor> findAll() {
        return Lists.newArrayList(actorRepository.findAll());
    }

    @Override
    public Actor findById(Long id) {
        return null;
    }

    @Override
    public Actor findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Actor> findByMovie(Movie movie) {
        return null;
    }

    @Override
    public Actor createOrUpdate(Actor actor) {
        return null;
    }

    @Override
    public void delete(Actor actor) {
    }

    public Criterion toCriteria(){
        return Restrictions.eq("lastName", expectedName);
    }
}
