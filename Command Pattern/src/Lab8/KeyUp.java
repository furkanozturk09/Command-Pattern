package Lab8;

public class KeyUp implements Command {

    private Key key;

    public KeyUp(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.keyUp();
    }
}
