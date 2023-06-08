import com.syntaxapplication.data.Flight;
import com.syntaxapplication.data.Movie;
import com.syntaxapplication.services.DurationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieFlightsDurationApplication {

    public static void main(String[] args) {
        List<Movie> dummyMovie =  Movie.createRandomMovies();
        Flight dummyFlight = new Flight(170);
        DurationService algorithmService = new DurationService();
        dummyMovie.forEach(movie -> System.out.println(movie.getDuration()));
        algorithmService.getAppropriateMovies(dummyMovie, dummyFlight);

    }
}
