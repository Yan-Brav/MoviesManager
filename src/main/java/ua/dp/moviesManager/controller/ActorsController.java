package ua.dp.moviesManager.controller;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.dp.moviesManager.entity.Actor;
import ua.dp.moviesManager.service.ActorService;

import java.util.List;

@RequestMapping("/actors")
@Controller
public class ActorsController {

    private final static Logger logger = LoggerFactory.getLogger(ActorsController.class);
    private ActorService actorService;

    @RequestMapping(method = RequestMethod.GET)
    public String actors(Model uimodel){
        logger.info("Actors listing");
        List<Actor> actors = actorService.findAll();
        uimodel.addAttribute("actors", actors);
        logger.info("No. of actors: " + actors.size());
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
        return "/actors/actors";
    }
}
