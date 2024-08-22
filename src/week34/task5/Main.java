package week34.task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String... blablabla) {
    List<Movie> movies = Arrays.asList(
        new Movie("The Godfather", "Francis Ford Coppola", 1972, 9.1),
        new Movie("The Dark Knight", "Christopher Nolan", 2008, 9.0),
        new Movie("Pulp Fiction", "Quentin Tarantino", 1994, 8.9),
        new Movie("Fight Club", "David Fincher", 1999, 8.8));

    // Sort alphabetically by title
    Collections.sort(movies, (m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
    System.out.println(movies);

    // Sort in ascending order of release year
    Comparator<Movie> sortAscendingReleaseYear = (m1, m2) -> m1.getReleaseYear() - m2.getReleaseYear();
    Collections.sort(movies, sortAscendingReleaseYear);
    System.out.println(movies);

  }
}
