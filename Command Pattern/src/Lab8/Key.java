package Lab8;

public class Key implements Pushable {
    private String id;

    public Key(String id) {
        this.id = id;
    }

    public void keyDown() {
        System.out.println(id+ " key pressed.");
    }

    public void keyUp() {
        System.out.println(id + " key released.");
    }

}
