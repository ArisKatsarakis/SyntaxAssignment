package com.syntaxapplication.data;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int duration;

    public Movie(int duration) {
        this.duration = duration;
    }



    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }

    public static List<Movie> createRandomMovies() {
        List<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(new Movie(90));
        listOfMovies.add(new Movie(85));
        listOfMovies.add(new Movie(75));
        listOfMovies.add(new Movie(60));
        listOfMovies.add(new Movie(120));
        listOfMovies.add(new Movie(150));
        listOfMovies.add(new Movie(125));
        return listOfMovies;
    }
}
