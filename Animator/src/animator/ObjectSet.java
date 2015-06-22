package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
   private Image[] images;
   private Rectangle[] rectangles;
   private Circle[] circles;
   private RoundedRectangle[] roundedRectangles;
   private Star[] stars;
   int nShapes;
   String shapeType;
   Random x = new Random();
    
    // Adiciona objetos da classe Image ao ObjectSet.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        nShapes = n;
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p = new Point(x.nextInt(dim.width),x.nextInt(dim.height));
            images[i] = new Image(p, image, path, dim);
        }
    }
    
    // Adiciona objetos da classe RoundedRectangle ao ObjectSet.
    void addRoundRectangles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d roundRectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        nShapes = n;
        roundedRectangles = new RoundedRectangle[n];
        shapeType = "roundedRectangle";
        for (int i = 0; i < roundedRectangles.length; i++) {
            Point p = new Point(x.nextInt(dim.width),x.nextInt(dim.height));
            roundedRectangles[i] = new RoundedRectangle(p, path, dim);
        }
    }
    
    // Adiciona objetos da classe Rectangle ao ObjectSet.
    void addRectangles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        nShapes = n;
        rectangles = new Rectangle[n];
        shapeType = "rectangle";
        for (int i = 0; i < rectangles.length; i++) {
            Point p = new Point(x.nextInt(dim.width),x.nextInt(dim.height));
            rectangles[i] = new Rectangle(p, path, dim);
        }
    }
    
    // Adiciona objetos da classe Circle ao ObjectSet.
    void addCircles(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d circles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        nShapes = n;
        circles = new Circle[n];
        shapeType = "circle";
        for (int i = 0; i < circles.length; i++) {
            Point p = new Point(x.nextInt(dim.width),x.nextInt(dim.height));
            circles[i] = new Circle(p, path, dim);
        }
    }
    
    void addStars(int n, Dimension dim, String path) {
        System.out.printf("Test: adding %d stars\n", n);
        System.out.printf("Test: motion path %s\n", path);
        nShapes = n;
        stars = new Star[n];
        shapeType = "star";
        for (int i = 0; i < stars.length; i++) {
            Point p = new Point(x.nextInt(dim.width),x.nextInt(dim.height));
            stars[i] = new Star(p, path, dim);
        }
    }
    
    // Desenha cada um dos objetos da animacao.
    void drawAll(Graphics g) {
        for(int i=0;i<images.length;i++){
            images[i].draw(g);
        }
        for(int i=0;i<nShapes;i++){
            if(shapeType == "rectangle"){
                rectangles[i].draw(g);
            }
            else if(shapeType == "circle")
                    circles[i].draw(g);
            else if(shapeType == "roundedRectangle")
                    roundedRectangles[i].draw(g);
            else if(shapeType == "star")
                    stars[i].draw(g);
        }
        System.out.println("drawAll");
    }

    // Move cada um dos objetos da animacao.
    void moveAll() {
        for(int i =0;i<images.length; i++){
            images[i].move();
        }
        for(int i =0;i<nShapes; i++){
            if(shapeType == "rectangle"){
                rectangles[i].move();
            }
            else if(shapeType == "circle")
                    circles[i].move();
            else if(shapeType == "roundedRectangle")
                    roundedRectangles[i].move();
            else if(shapeType == "star")
                    stars[i].move();
        }
        System.out.println("moveAll");
    }
}
