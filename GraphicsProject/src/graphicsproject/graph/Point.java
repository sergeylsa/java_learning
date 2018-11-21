
package graphicsproject.graph;


public class Point extends GraphObject{
   public int x;
   public int y;
   
   public void move(int dx, int dy){
       x += dx;
       y += dy;
       
   }

    @Override
    public void draw() {
        super.draw();
        System.out.printf("Point (%d, %d) %s\n", x, y, super.color);
    }
   
   
}
