package bpsieben;

public class VideoTesterApp {
    public static void main(String[] args) throws Exception {
        VideoManager manager = new VideoManager();

        Movie wall = new Movie("Wall-E", 8.7);
        Movie john = new Movie("John Wick", 10);
        Movie shark = new Movie("Sharknado", 6.9);
        Movie mistake = new Movie("m", 0);
        Movie pokemon = new Movie("Mewtwo Strikes Back", 999999999);
        Movie ice = new Movie("Ice Age", 9.1);

        Series boys = new Series("The Boys", 99999);
        Series game = new Series("Game of Thrones", 8.8);
        Series error = new Series("e", 0);
        Series cards = new Series("House of Cards", 8.8);
        Series pony = new Series("My Little Pony", 6.9);
        Series umbrella = new Series("The Umbrella Academy", 100);

        MovieTryers(manager, wall, john, shark);
        MovieTryers(manager, mistake, pokemon, ice);

        SeriesTryers(manager, boys, game, error);
        SeriesTryers(manager, pony, umbrella, cards);

        Video[] sortedVideos = manager.getSortedVideoArray();
        for (Video video : sortedVideos) {
            System.out.println(video);
        }
        System.out.println("\n");

        try {
            manager.addVideo(boys);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            manager.addVideo(pokemon);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            manager.addVideo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        sortedVideos = manager.getSortedVideoArray();
        for (Video video : sortedVideos) {
            System.out.println(video);
        }
        System.out.println("\n");

        manager.removeVideo(shark);

        sortedVideos = manager.getSortedVideoArray();
        for (Video video : sortedVideos) {
            System.out.println(video);
        }
    }

    private static void MovieTryers(VideoManager manager, Movie m1, Movie m2, Movie m3) {
        try {
            manager.addVideo(m1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            manager.addVideo(m2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            manager.addVideo(m3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void SeriesTryers(VideoManager manager, Series s1, Series s2, Series s3) {
        try {
            manager.addVideo(s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            manager.addVideo(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            manager.addVideo(s3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
