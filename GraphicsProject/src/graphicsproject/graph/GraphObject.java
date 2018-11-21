
package graphicsproject.graph;

public class GraphObject {
   public String color = "Black";
   
   public void draw(){
       System.out.printf("GraphObject %s\n",color);
   }

    @Override
    public String toString() {
        return String.format("GraphObject %s\n",color);
    }
   
   
}


//02:43