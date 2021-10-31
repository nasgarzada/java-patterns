package patterns.observer;

public class LcdDisplay implements Screen {

    @Override
    public void print(String text) {
        System.out.println("LCD display is connected");
        System.out.println(text);
    }
    
}
