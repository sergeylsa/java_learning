
package graphicsproject.graph;


public class Point extends GraphObject implements Cloneable{
   public int x;
   public int y;

    public Point() {
        this(0, 0, DEFAULT_COLOR);
        System.out.println("Point() constr");
    }
    
    public Point(int x, int y){
        this(x, y, DEFAULT_COLOR);
        System.out.println("Point(x,y) constr");
    }

   public Point(int x, int y, String color){
       
      super(color);
       this.x= x;
       this.y = y;
       System.out.println("Point(x,y,color) constr");
   }
   
   public void move(int dx, int dy){
       x += dx;
       y += dy;
       
   }

    @Override
    public void draw() {
        super.draw();
        System.out.println(this);    
    }

    @Override
    public String toString() {
        return String.format("Point (%d, %d) %s\n", x, y, super.color);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return  new Point(x, y, color);
    }
    
    
    
    
   
   
}
