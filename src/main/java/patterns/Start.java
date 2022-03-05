package patterns;

public class Start {
    private static Application config() {
        Application app;
        AbstractFactory factory = new AutoFactory();
        return new Application(factory);

    }
    public static void main(String[] args) {
        Application app = config();
        app.check();
    }
}
