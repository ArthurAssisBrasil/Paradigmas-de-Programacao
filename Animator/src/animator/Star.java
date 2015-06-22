package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.Random;

public class Star {
    Dimension dim;
    private String path;
    Point pos;
    PathLineHoriz pathLineHoriz;
    PathLineVert pathLineVert;
    PathZigZag pathZigZag;
    int width;
    int height;
    
    Random rand = new Random();
    
    public Star(Point pos, String path, Dimension dim){
       this.pos = pos;
       this.path = path;
       this.width = 55;
       this.height = 20;
       pathLineHoriz = new PathLineHoriz(pos,dim);
       pathLineVert = new PathLineVert(pos,dim);
       pathZigZag = new PathZigZag(pos, dim);
   } 
    
    public PathLineHoriz getPathLineHoriz(){
        return new PathLineHoriz(pos,dim);
    }
    
    public PathLineVert getPathLineVert(){
        return new PathLineVert(pos,dim);
    }
    
    public PathZigZag getPathZigZag(){
        return new PathZigZag(pos, dim);
    }
        
    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
        double angle = Math.PI / 5;

        GeneralPath gp = new GeneralPath();
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 10; i++){
            double r = (i & 1) == 0 ? this.width : this.height;
            Point2D.Double p = new Point2D.Double(this.pos.x + Math.cos(i * angle) * r, this.pos.y + Math.sin(i * angle) * r);
            
            if (i == 0) gp.moveTo(p.getX(), p.getY());
            else gp.lineTo(p.getX(), p.getY());
        }
    
        gp.closePath();
        g2.setColor(Color.YELLOW);
        g2.fill(gp);     
    }
    
    public void move() {
       if(path == "Horizontal Line"){
           pathLineHoriz.move();
       }
       if(path == "Vertical Line"){
           pathLineVert.move();
       }
       if(path == "ZigZag"){
           pathZigZag.move();
       }
    }
}
