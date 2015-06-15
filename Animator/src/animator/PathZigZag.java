package animator;

import java.awt.Dimension;
import java.awt.Point;

public class PathZigZag {
    Point pos;
    int incrementoY = 3;
    int pInicial;
    Dimension dim;
    
    public PathZigZag(Point pos, Dimension dim){
        this.pos = pos;
        this.pInicial = pos.y;
        this.dim = dim;
    }
    
    public void move(){
        pos.x += 3;
        if(pos.x > dim.width)
            pos.x = 0;
        pos.y = pos.y + incrementoY;
        if(pos.y > pInicial + 30 || pos.y < pInicial - 30)
            incrementoY = incrementoY - (2*incrementoY);
        
    }
}

