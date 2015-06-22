package animator;


import java.awt.Dimension;
import java.awt.Point;

public class PathLineVert {
    Dimension dim;
    Point pos;
    
    public PathLineVert(Point pos, Dimension dim){
        this.pos = pos;
        this.dim = dim;
    }
    
    public void move(){
        pos.y += 3;
        if(pos.y > dim.height)
            pos.y = 0;
    }
}
