
package loops;


public class Loops {
    //Constant
    public static final int MAX = 100;

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
            if(i == 8){
                break;
            }
        }
        
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                int n = i * j;
                System.out.printf("%5d", n);
            }
            System.out.println("");    
        }
        
        int c = 1000;
        while(c < 1000){
            System.out.println(c);
            c *= 2;
        }
        c = 1000;
        do{
           System.out.println(c);
            c *= 2;
        }while(c < 1000);
    }
    
}
