package patterns;

public class Application {
    private ButtonOne buttonOne;

    public Application(AbstractFactory factory) {
        buttonOne = factory.createButton();
    }

    public void check () {
        buttonOne.click();
    }
}
