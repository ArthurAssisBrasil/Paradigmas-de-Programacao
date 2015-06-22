package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {
    Dimension dim;
    private String path;
    BufferedImage img;
    Point pos;
    PathLineHoriz pathLineHoriz;
    PathLineVert pathLineVert;
    PathZigZag pathZigZag;

    public Image(Point pos, BufferedImage img, String path, Dimension dim) {
        this.pos = pos;
        this.img = img;
        this.path = path;
        this.dim = dim;
        pathLineHoriz = new PathLineHoriz(pos,dim);
        pathLineVert = new PathLineVert(pos,dim);
        pathZigZag = new PathZigZag(pos,dim);
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
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
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
