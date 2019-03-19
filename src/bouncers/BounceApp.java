package bouncers;

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BounceApp {
    private LinkedList<Bouncable> bouncers = new LinkedList<>();

    // The frame for the main view, singleton with access to panel properties
    private BFrame frame;

    // Rate at which the redrawing will happen in milliseconds
    private static final int UPDATE_RATE = 40;

    public BounceApp() {
        frame = BFrame.getInstance();

        // Respond to key presses
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_B: System.out.println("Border");
                                        for (int i = 0; i < 10; i++) {
                                            bouncers.add(BorderFactory.getInstance().createSquare());
                                            bouncers.add(BorderFactory.getInstance().createDisk());
                                        }
                                        break;

                    case KeyEvent.VK_F: System.out.println("Full");
                                        for (int i = 0; i < 10; i++) {
                                            bouncers.add(FilledFactory.getInstance().createSquare());
                                            bouncers.add(FilledFactory.getInstance().createDisk());
                                        }
                                        break;

                    case KeyEvent.VK_E: System.out.println("Erase");
                                        bouncers.clear();
                                        break;

                    case KeyEvent.VK_Q: System.exit(0);
                }
            }
        });
    }

    /**
     * Main display loop
     */
    public void loop() {
        // Schedule a task to run immediately, and then
        // every UPDATE_RATE per second
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Callback to paintComponent()
                frame.repaint();

                // Change every shape's coordinates
                for (Bouncable bouncer : bouncers) {
                    bouncer.move();
                    bouncer.draw();
                }
            }
        }, 0, UPDATE_RATE);
    }

    public static void main(String ... args) {
        new BounceApp().loop();
    }
}
