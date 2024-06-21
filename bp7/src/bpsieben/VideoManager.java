package bpsieben;

import java.util.*;

public class VideoManager {
    private final PriorityQueue<Video> queue;

    public VideoManager() {
        queue = new PriorityQueue<>(new VideoComparator());
    }

    public void addVideo(Video v) {
        /*boolean found = false;
        Iterator<Video> it = queue.iterator();

        while(it.hasNext()) {
            if(v.getTitle().equalsIgnoreCase(it.next().getTitle())) {
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

        /*Video[] retList = new Video[queue.size()];
        Arrays.sort(retList, queue.comparator());
        return retList;*/
    }
}
