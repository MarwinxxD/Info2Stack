package bpsieben;

public class Movie extends Video {
    protected Movie(String title, double score) throws IllegalArgumentException {
        super(title, score);
    }

    @Override
    public String toString() {
        return "<" + this.getClass().getSimpleName() + "> " + super.toString();
    }
}
