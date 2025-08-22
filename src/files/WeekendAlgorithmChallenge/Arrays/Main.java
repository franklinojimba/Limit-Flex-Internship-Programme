package files.WeekendAlgorithmChallenge.Arrays;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>(5);
        Movie myMovie1 = new Movie("James Gunn", 2025, "Superman" );
        Movie myMovie2 = new Movie("Zack Snyder", 2107, "Justice League" );
        movies.add(myMovie1);
        movies.add(myMovie2);
        movies.removeFirst();
        System.out.println(movies);
    }
}
