
package graphicsproject;

import graphicsproject.graph.Circle;
import graphicsproject.graph.GraphObject;
import graphicsproject.graph.Point;
import graphicsproject.graph.Singleton;
import java.util.ArrayList;
import java.util.List;


public class GraphicsProject {
  public static List<GraphObject> o1 = new ArrayList<GraphObject>();
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point();
        Circle c1 = new Circle();
        GraphObject g1 = new GraphObject();
        o1.add(p1);
        o1.add(c1);
        o1.add(g1);
        
        
      
//        
//        System.out.println("Polimorfism");
//        System.out.println("----------------------------");
//       // p1.draw();
//        //g1.draw();
//        sendDraw();
//        System.out.println("----------------------------");
        
        GraphObject.drawScene();
//        Object o1 = new Point();
//        
//        System.out.println(o1 instanceof GraphObject);
//        
//        if(g1 instanceof Point){
//            Point p2 = (Point)g1;
//            p2.draw();
//        }
        //System.out.println("");
        
        
       
        
//        Object o1 = new Point();
//        
//        System.out.println(o1 instanceof GraphObject);
//        System.out.println(o1 instanceof Point);
//        System.out.println(o1 instanceof Circle);
        
        
        //System.out.println("---------------------------");
        //g1.draw();
        //System.out.println("---------------------------");
        // p1.color = "Blue";
        //p1.x = 110;
        //p1.y = 210;
        //p1.draw();
        //p1.move(90, 90);
        //p1.draw();
        
        //System.out.println(p1.getColor());
        
       
        
        
        
        //Circle c1 = new Circle(15, 3, 4, "Blu");
       // c1.draw();
        
        //Circle c2 = new Circle(15, p1, "Blu");
        //c2.draw();
        
        //Point p2 = p1.clone();
        //p2.draw();
       // System.out.println(p1);
        
        
       // GraphObject.drawScene();
        
        
//        Singleton s = Singleton.getInstance();
//        System.out.println(s.toString());
//        Singleton s2 = Singleton.getInstance();
//        System.out.println(s2.toString());
    }
    public static void sendDraw(){
        for(GraphObject o : o1){
            o.draw();
        }
    }
}
//01:32:57