package zweiunddreisig;

import java.util.ArrayList;

public class Concert {
    private Venue venue;
    private ArrayList<Artist> artists = new ArrayList<>();

    public void linkVanue(Venue venue) {
        this.venue = venue;
    }

    public Venue getlinkVenue() {
        return venue;
    }

    public void linkArtist(Artist artist) {
        artists.add(artist);
    }

    public void unlinkArtist(Artist artist) throws ConcertException {
        if (!artists.remove(artist)) {
            throw new ConcertException("There are no invited Artists");
        }
    }

    public ArrayList<Artist> getlinkArtists() {
        return artists;
    }
}