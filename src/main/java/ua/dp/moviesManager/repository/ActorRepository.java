package ua.dp.moviesManager.repository;

import org.springframework.data.repository.CrudRepository;
import ua.dp.moviesManager.entity.Actor;

public interface ActorRepository extends CrudRepository<Actor, Long>{
}
