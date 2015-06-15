package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class RoundedRectangle {
    Dimension dim;
    private String path;
    Point pos;
    PathLine pathLine;
    PathZigZag pathZigZag;
    int width;
    int height;
    
    Random rand = new Random();
    
    public RoundedRectangle(Point pos, String path, Dimension dim){
       this.pos = pos;
       this.path = path;
       this.dim = dim;
       this.width = 25 + rand.nextInt(150);
       this.height = 25 + rand.nextInt(150);
       pathLine = new PathLine(pos,dim);
       pathZigZag = new PathZigZag(pos, dim);
   }
    
    public PathLine getPathLine(){
        return new PathLine(pos,dim);
    }
    
    public PathZigZag getPathZigZag(){
        return new PathZigZag(pos, dim);
    }
    
    public Point getPos() {
        return pos;
    }
   
    
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRoundRect(pos.x, pos.y, width, height, 30, 30);
    }
    
    public void move() {
       if(path == "Line"){
           pathLine.move();
       }
       if(path == "ZigZag"){
           pathZigZag.move();
       }
    }
}
