
package operators;


public class Operators {

    public static void main(String[] args) {
        int a = 0;
        if (a > 0){
            System.out.println("a > 0");
        }else if (a == 0){
            System.out.println("a = 0");
        }else{
            System.out.println("a < 0");
        }
        
        int n = 10;
        String s = (n == 0? "Zerro":"not Zerro");
        System.out.println(s);
        
    }
    
}
