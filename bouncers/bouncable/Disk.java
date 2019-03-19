package bouncers.bouncable;

import bouncers.Bouncable;
import bouncers.Renderable;

import java.awt.Graphics;

/**
 * Class Disk
 */
public abstract class Disk extends Shape implements Bouncable {

    public Disk(Renderable renderer) { super(renderer); }

}
