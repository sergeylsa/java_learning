
package graphicsproject.graph;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class GraphObject {
   protected String color = "Black";
   public static final String DEFAULT_COLOR = "Black";
   private static List<GraphObject> scene = new ArrayList<GraphObject>();
   
    public GraphObject() {
        
        this(DEFAULT_COLOR);
        System.out.println("GraphObject() constr");
    }

   public GraphObject(String color){
       this.color = color;
       System.out.println("GraphObject(color) constr");
       scene.add(this);
   }
   
   public void draw(){
       System.out.printf("GraphObject %s\n",color);
   }

    @Override
    public String toString() {
        return String.format("GraphObject %s\n",color);
    }
   public String getColor(){
       return this.color;
   }
   
   public static void drawScene(){
       System.out.println("*****************************");
       for(GraphObject g : scene){
           g.draw();
       }
   }
   
 
   
}


//4.1 19:02