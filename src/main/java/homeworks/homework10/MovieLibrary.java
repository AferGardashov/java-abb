package homeworks.homework10;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    private List<Movie> movieList = new ArrayList<>();


    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void removeMovie(Movie movie) {
        movieList.remove(movie);
    }

    public List<Movie> getMovieByTitle(String title) {
        List<Movie> list = new ArrayList<>();
        for (Movie m : movieList) {
            if (m.getTitle().equals(title)) {
                list.add(m);
            }
        }
        return list;
    }

    public List<Movie> getMovieByDirector(String director) {
        List<Movie> list = new ArrayList<>();
        for (Movie m : movieList) {
            if (m.getDirector().equals(director)) {
                list.add(m);
            }
        }
        return list;
    }

    public List<Movie> getMovieByGenre(String genre) {
        List<Movie> list = new ArrayList<>();
        for (Movie m : movieList) {
            if (m.getGenre().equals(genre)) {
                list.add(m);
            }
        }
        return list;
    }

    public List<Movie> getMovieByReleaseYear(int year) {
        List<Movie> list = new ArrayList<>();
        for (Movie m : movieList) {
            if (m.getReleaseYear() == year) {
                list.add(m);
            }
        }
        return list;
    }

    public int averageReleaseYear() {
        int count = 0;
        int sum = 0;
        for (Movie m : movieList) {
            sum += m.getReleaseYear();
            count++;
        }
        return sum / count;
    }


    public int numberOfMovies() {
        return movieList.size();
    }

}
