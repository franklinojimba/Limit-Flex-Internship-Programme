package files.WeekendAlgorithmChallenge.Arrays;

public class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String director, int year, String title) {
        this.director = director;
        this.year = year;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
