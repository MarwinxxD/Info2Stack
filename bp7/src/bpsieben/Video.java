package bpsieben;

public abstract class Video {
    private static final int MIN_TITLE_LENGTH = 2;
    private static final double MIN_SCORE = 0.0;
    private static final double MAX_SCORE = 10.0;

    private String title;
    private double score;

    protected Video(String title, double score) throws IllegalArgumentException {
        try {
            setTitle(title);
            setScore(score);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getTitle() {
        return title;
    }

    public double getScore() {
        return score;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (!checkTitle(title)) {
            throw new IllegalArgumentException("Title must be at least " + MIN_TITLE_LENGTH + " characters");
        } else {
            this.title = title;
        }
    }

    protected void setScore(double score) {
        if (score < MIN_SCORE || score > MAX_SCORE) {
            if (Math.abs(score - MAX_SCORE) < Math.abs(score - MIN_SCORE))
                this.score = MAX_SCORE;
            else
                this.score = MIN_SCORE;
        } else {
            this.score = score;
        }
    }

    @Override
    public String toString() {
        return title + "(" + score + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Video v) {
            if (title != null) {
                return title.equals(v.title);
            }
        }
        return false;
    }

    private boolean checkTitle(String title) {
        if (title != null) {
            return title.length() >= MIN_TITLE_LENGTH;
        }
        return false;
    }
}
