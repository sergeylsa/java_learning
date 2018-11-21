
package graphicsproject;

import graphicsproject.graph.Point;


public class GraphicsProject {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.color = "Blue";
        p1.x = 110;
        p1.y = 210;
        p1.draw();
        p1.move(90, 90);
        p1.draw();
        
        System.out.println(p1);
    }
    
}
