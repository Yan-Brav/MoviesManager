package ua.dp.moviesManager.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    @Transactional(readOnly = true)
    public List<Actor> findAll() {
        return Lists.newArrayList(actorRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public Actor findById(Long id) {
        return actorRepository.findOne(id);
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
        return actorRepository.save(actor);
    }

    @Override
    public void delete(Actor actor) {
    }

    @Autowired
    public void setActorRepository(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

}
