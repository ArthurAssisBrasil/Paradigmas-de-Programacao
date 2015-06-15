package animator;

import java.awt.Dimension;
import java.awt.Point;

public class PathLine {
    Dimension dim;
    Point pos;
    
    public PathLine(Point pos, Dimension dim){
        this.pos = pos;
        this.dim = dim;
    }
    
    public void move(){
        pos.x += 3;
        if(pos.x > dim.width)
            pos.x = 0;
    }
}
