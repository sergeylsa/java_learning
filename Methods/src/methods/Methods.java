
package methods;

import java.lang.reflect.Method;

public class Methods {
    
    public static void sayHello(){
        System.out.println("Hello");
    }  
    
    public static void main(String[] args) {
       sayHello();
        Methods.sayHello();
       
    }
    
}
