package siebensundzwanzig;

import java.util.Optional;

public class Movie {
    private String title;
    private int releaseYear;
    private Optional<String[]> director;
    private Genre genre;

    public Movie(String title, int releaseYear, Genre genre) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setGenre(genre);
    }

    public Movie(String title, int releaseYear, Optional<String[]> director, Genre genre) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setGenre(genre);
        setDirector(director);
    }

    private boolean checkTitle(String title) {
        return !title.isEmpty() && title.length() < 50;
    }
    private boolean checkRelease(int releaseYear) {
        return releaseYear >= 1950;
    }

    private boolean checkDirector(Optional<String[]> director) {
        return director.isPresent();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (checkTitle(title)) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title is invalid");
        }
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) throws IllegalArgumentException {
        if (checkRelease(releaseYear)) {
            this.releaseYear = releaseYear;
        } else {
            throw new IllegalArgumentException("Release year is invalid");
        }
    }

    public Optional<String[]> getDirector() {
        return director;
    }

    public void setDirector(Optional<String[]> director ) throws IllegalArgumentException {
        if (checkDirector(director)) {
            this.director = director;
        } else {
            throw new IllegalArgumentException("Director is invalid");
        }
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
