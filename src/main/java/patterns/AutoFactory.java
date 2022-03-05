package patterns;

public class AutoFactory implements AbstractFactory{
    @Override
    public ButtonOne createButton() {
        return new Auto();
    }
}
