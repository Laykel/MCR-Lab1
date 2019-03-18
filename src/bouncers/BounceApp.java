package bouncers;

import bouncers.bouncable.*;

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public class BounceApp {
    private LinkedList<Bouncable> bouncers;
    // Autres attributs

    public BounceApp() {
        /* ... */
    }

    public void loop() {
        // Schedule a task to run immediately, and then
        // every UPDATE_RATE per second
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Change every shape's coordinates
                for (Bouncable bouncer : bouncers) {
                    bouncer.move(panel.getWidth(), panel.getHeight());
                }

                // Callback to paintComponent()
                panel.repaint();
            }
        }, 0, 1000 / UPDATE_RATE);
    }

    public static void main(String ... args) {
        new BounceApp().loop();
    }
}
