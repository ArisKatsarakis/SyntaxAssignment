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
        listOfMovies.add(new Movie(60));
        listOfMovies.add(new Movie(80));
        listOfMovies.add(new Movie(30));
        return listOfMovies;
    }
}
