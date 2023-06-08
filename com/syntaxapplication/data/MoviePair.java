package com.syntaxapplication.data;

public class MoviePair {
    private int movieOneIndex;
    private int movieTwoIndex;
    private int combinedDuration;

    public MoviePair(int movieOneIndex, int movieTwoIndex, int combinedDuration) {
        this.movieOneIndex = movieOneIndex;
        this.movieTwoIndex = movieTwoIndex;
        this.combinedDuration = combinedDuration;
    }

    public int getMovieOneIndex() {
        return movieOneIndex;
    }

    public void setMovieOneIndex(int movieOneIndex) {
        this.movieOneIndex = movieOneIndex;
    }

    public int getMovieTwoIndex() {
        return movieTwoIndex;
    }

    public void setMovieTwoIndex(int movieTwoIndex) {
        this.movieTwoIndex = movieTwoIndex;
    }

    public int getCombinedDuration() {
        return combinedDuration;
    }

    public void setCombinedDuration(int combinedDuration) {
        this.combinedDuration = combinedDuration;
    }

    @Override
    public String toString() {
        return "MoviePair{" +
                "movieOneIndex=" + movieOneIndex +
                ", movieTwoIndex=" + movieTwoIndex +
                ", combinedDuration=" + combinedDuration +
                '}';
    }
}
