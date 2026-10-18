package service;

import model.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private final List<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(new Movie("Inception", 148, 12.0));
        movies.add(new Movie("Interstellar", 169, 15.0));
        movies.add(new Movie("The Dark Knight", 152, 10.0));
    }

    public Movie findMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }

        return null;
    }

    public void showMovies() {
        System.out.println("Available movies:");

        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " - $" + movie.getTicketPrice());
        }
    }
}
