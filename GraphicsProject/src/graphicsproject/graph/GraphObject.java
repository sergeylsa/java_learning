
package graphicsproject.graph;

public class GraphObject {
   public String color = "Black";
   public static final String DEFAULT_COLOR = "Black";
   
    public GraphObject() {
        
        this(DEFAULT_COLOR);
        System.out.println("GraphObject() constr");
    }

   public GraphObject(String color){
       this.color = color;
       System.out.println("GraphObject(color) constr");
   }
   
   public void draw(){
       System.out.printf("GraphObject %s\n",color);
   }

    @Override
    public String toString() {
        return String.format("GraphObject %s\n",color);
    }
   
   
}


//03:15