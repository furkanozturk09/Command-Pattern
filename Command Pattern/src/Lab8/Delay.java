package Lab8;

public class Delay implements Command {

    TimeMilliSeconds timeMilliSeconds;

    public Delay(TimeMilliSeconds timeMilliSeconds) {
        this.timeMilliSeconds = timeMilliSeconds;
    }

    @Override
    public void execute() {
        System.out.println("Waiting for " + timeMilliSeconds.toString());
    }
}
