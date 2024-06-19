package bpsieben;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class VideoManager {
    private final PriorityQueue<Video> queue = new PriorityQueue<>(new VideoComparator());

    public VideoManager() {}

    public void addVideo(Video v) throws NullPointerException, IllegalArgumentException {
        /*Iterator<Video> it = queue.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Video v2 = it.next();
            if (v2.getTitle().equalsIgnoreCase(v.getTitle())) {
                found = true;
            }
        }*/

        if (v == null) {
            throw new NullPointerException("Video is non existant");
        } else {
            if (queue.contains(v)) {
                throw new IllegalArgumentException("Video already added");
            } else {
                queue.offer(v);
            }
        }
    }

    public boolean removeVideo(Video v) {
        return queue.remove(v);
    }

    public Video[] getSortedVideoArray() {
        List<Video> myList = new ArrayList<>(queue);
        myList.sort(queue.comparator());
        return myList.toArray(new Video[myList.size()]);
    }
}
