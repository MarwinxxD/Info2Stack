package bpsieben;

import java.util.Comparator;

public class VideoComparator implements Comparator<Video> {

    @Override
    public int compare(Video v1, Video v2) {
        if (v1.getScore() > v2.getScore()) {
            return -1;
        } else if (v1.getScore() < v2.getScore()) {
            return 1;
        } else {
            if (v1 instanceof Movie && v2 instanceof Series) {
                return -1;
            } else if (v1 instanceof Series && v2 instanceof Movie) {
                return 1;
            }
            return 0;
        }
    }
}
