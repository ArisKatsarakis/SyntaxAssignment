package com.syntaxapplication.services;

import com.syntaxapplication.data.Flight;
import com.syntaxapplication.data.Movie;
import com.syntaxapplication.data.MoviePair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DurationService {

    public List<MoviePair> getMoviePairs(List<Movie> movies) {
        List<MoviePair> moviePairs = new ArrayList<>();
        int moviesLength = movies.toArray().length;
        IntStream.range(0, moviesLength).forEach( movieOneIndex -> {
                        IntStream.range(0, moviesLength).forEach(
                                movieTwoIndex -> {
                                        if (movieOneIndex !=  movieTwoIndex)
                                        moviePairs.add(new MoviePair(movieOneIndex, movieTwoIndex, movies.get(movieOneIndex).getDuration() + movies.get(movieTwoIndex).getDuration() ));
                                }
                        );
                }

        );
        return moviePairs;
    }

    public MoviePair getBestMoviePairAccordingToFlightDuration(List<MoviePair> moviePairs, int flightDuration) {
        MoviePair bestMoviePair = new MoviePair(0, 0, 0);
        moviePairs.stream().forEach(
                moviePair -> {
                    if (moviePair.getCombinedDuration() <= flightDuration) {
                        if (bestMoviePair.getCombinedDuration() < moviePair.getCombinedDuration()) {
                            bestMoviePair.setMovieOneIndex(moviePair.getMovieOneIndex());
                            bestMoviePair.setMovieTwoIndex(moviePair.getMovieTwoIndex());
                            bestMoviePair.setCombinedDuration(moviePair.getCombinedDuration());
                        }
                    }
                }
        );

        return bestMoviePair;

    }
}
