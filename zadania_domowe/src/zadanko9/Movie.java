package zadanko9;

import java.util.List;

public class Movie {

    private String title;
    private int year;
    private Director director;
    private List<Actor> actor;

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public Movie(String title, int year, Director director, List<Actor> actor) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.actor = actor;
    }
}