package ua.dp.moviesManager.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Location implements Serializable {

    private Long id;
    private String place;
    private String description;
    private Set<Box> boxes = new HashSet<Box>();
}
