
package graphicsproject;

import graphicsproject.graph.Circle;
import graphicsproject.graph.GraphObject;
import graphicsproject.graph.Point;
import graphicsproject.graph.Singleton;


public class GraphicsProject {

    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point();
        // p1.color = "Blue";
        //p1.x = 110;
        //p1.y = 210;
        p1.draw();
        p1.move(90, 90);
        p1.draw();
        
        System.out.println(p1.getColor());
        
       
        
        
        
        Circle c1 = new Circle(15, 3, 4, "Blu");
        c1.draw();
        
        Circle c2 = new Circle(15, p1, "Blu");
        c2.draw();
        
        Point p2 = p1.clone();
        p2.draw();
        System.out.println(p1);
        
        
        GraphObject.drawScene();
        
        
        Singleton s = Singleton.getInstance();
        System.out.println(s.toString());
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.toString());
    }
    
}
