package patterns.observer;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;

public class WeatherApp {
    private Screen screen;

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    private BigDecimal getTemprature() {
        var random = new Random(200);
        return BigDecimal.valueOf(random.nextDouble()).round(MathContext.DECIMAL64);
    }

    public void displayTemprature() {
        var temp = getTemprature();
        screen.print("Temprature is: " + temp);
    }

}
