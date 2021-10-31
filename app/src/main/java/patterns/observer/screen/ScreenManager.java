package patterns.observer.screen;

import java.util.ArrayList;
import java.util.List;

import patterns.observer.Observable;

public class ScreenManager implements Observable<Screen>, Screen {
    private List<Screen> screens;

    public ScreenManager() {
        this.screens = new ArrayList<>();
    }

    @Override
    public void observe(Screen screen) {
        if (!(screen instanceof ScreenManager)) {
            this.screens.add(screen);
        } else {
            throw new RuntimeException("manager can't be set");
        }
    }

    @Override
    public void print(String text) {
        this.screens.forEach(screen -> screen.print(text));
    }

}
