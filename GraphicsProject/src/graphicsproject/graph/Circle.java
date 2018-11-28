
package graphicsproject.graph;

public class Circle extends GraphObject{
    
    private int radius;
    public Point coordinate;

    public Circle() {
        this(0, new Point(), DEFAULT_COLOR);
    }
    public Circle(int radius, int x, int y, String color){
        this(radius, new Point(x, y), color);
    }
    

    public Circle(int radius, Point coordinate, String color) {
        super(color);
        this.radius = radius;
        this.coordinate = coordinate;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
    
    

    @Override
    public String toString() {
        return String.format("Circle: radius = %d, center coordinate = (%d,%d), color = %s\n", radius,coordinate.x,coordinate.y,super.color);
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return new Circle(radius, coordinate , color);
    }
 
    public void setRadius(int radius){
        
        if(radius > 0){
            this.radius = radius;
        }else{
            System.out.println("error");
        }
    }    
    public int getRadius(){
        return this.radius;
    }

    
    
}
