
package methods;

import java.lang.reflect.Method;

public class Methods {
    
    public /*static*/ void sayHello(){
        System.out.println("Hello");
    }  
    
    public void sayHello(String name){
        System.out.printf("hello, %s! \n", name);
    
    }
    
    public void sayHello(String name, int age){
        System.out.printf("hello, %s - %d! \n", name,age);
    
    }
    
    public static double average(int x, int y){
        double avg = (x + y)/ 2D;
        return avg;
    }

//    public static double average(int[] m){
//        int sum = 0;
//        for(int k :m){
//            sum += k;
//        }
//        
//        return (double)sum / m.length;
//    }
    
    public static double average(int... m){
        int sum = 0;
        for(int k :m){
            sum += k;
        }
        
        return (double)sum / m.length;
    }
    

    public static void main(String[] args) {
//       sayHello();
//        Methods.sayHello(); 

         Methods m = new Methods();
         m.sayHello();
         m.sayHello("Sergey");
         m.sayHello("Sergey", 27);
         
         System.out.println(average(5, 6));
         int[] m1 = new int[]{1,2,3,4,5};
         System.out.println(average(m1));
         //System.out.println(average(new int[]{10,20,30,40}));
         System.out.println(average(10,20,30,40));
         
         31:00
    }
    
}
