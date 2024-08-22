package week34.task5;

/**
 * Class that represents a movie. Contains methods for extracting the
 * information about the movie.
 */
public class Movie {
  private String title;
  private String director;
  private int releaseYear;
  private double imdbRating;

  /**
   * Constructs a new movie with the given arguments
   * 
   * @param title
   * @param director
   * @param releaseYear
   * @param imdbRating
   */
  public Movie(String title, String director, int releaseYear, double imdbRating) {
    this.title = title;
    this.director = director;
    this.releaseYear = releaseYear;
    this.imdbRating = imdbRating;
  }

  public String getTitle() {
    return title;
  }

  public String getDirector() {
    return director;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public double getImdbRating() {
    return imdbRating;
  }

  @Override
  public String toString() {
    return "[" + title + ", " + director + ", " + releaseYear + ", "
        + imdbRating + "]";
  }

}
