import com.syntaxapplication.data.Flight;
import com.syntaxapplication.data.Movie;
import com.syntaxapplication.data.MoviePair;
import com.syntaxapplication.services.DurationService;

import java.util.Arrays;
import java.util.List;

public class MovieFlightsDurationApplication {

    public static void main(String[] args) {
        List<Movie> dummyMovies =  Movie.createRandomMovies();
        Flight dummyFlight = new Flight(250);
        DurationService algorithmService = new DurationService();
        List<MoviePair> listOfMoviePairs = algorithmService.getMoviePairs(dummyMovies);
        MoviePair moviePair = algorithmService.getBestMoviePairAccordingToFlightDuration( listOfMoviePairs, dummyFlight.getDuration() - 30);
        System.out.println( "Best Solution is " + moviePair.toString());
        System.out.println( "Output: [" + moviePair.getMovieOneIndex() + "],[" + moviePair.getMovieTwoIndex() + "]");

    }
}
