package Lab8;

public class TimeMilliSeconds {

    int secs;

    public TimeMilliSeconds(int secs) {
        this.secs = secs;
    }

    @Override
    public String toString() {
        return secs + " second(s)";
    }
}
