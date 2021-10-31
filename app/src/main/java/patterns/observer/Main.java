package patterns.observer;

public class Main {
    public void run() {
        var app = new WeatherApp();
        
        var screenManager = new ScreenManager();
        screenManager.observe(new LcdDisplay());
        screenManager.observe(new LogDisplay());
        screenManager.observe(new LcdDisplay());

        app.setScreen(screenManager);

        app.displayTemprature();
    }
}
