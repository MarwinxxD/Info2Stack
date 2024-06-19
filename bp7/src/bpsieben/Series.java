package bpsieben;

public class Series extends Video {
    protected Series(String title, double score) throws IllegalArgumentException {
        super(title, score);
    }

    @Override
    public String toString() {
        return "<" + this.getClass().getSimpleName() + "> " + super.toString();
    }
}
