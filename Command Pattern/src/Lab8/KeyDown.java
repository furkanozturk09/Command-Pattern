package Lab8;

public class KeyDown implements Command {

    private Key key;

    public KeyDown(Key key) {
        this.key = key;
    }

    @Override
    public void execute() {
        key.keyDown();
    }
}
