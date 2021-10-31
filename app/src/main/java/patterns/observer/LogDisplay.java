package patterns.observer;

public class LogDisplay implements Screen {

    @Override
    public void print(String text) {
        System.out.println("Logging is activated");
        System.out.println(text);
    }
    
}
