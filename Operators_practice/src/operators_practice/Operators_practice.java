
package operators_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Operators_practice {

  
    public static void main(String[] args) throws IOException {
        //or
        //Scanner reader = new Scanner(System.in);
        //int cnt = reader.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количемтво ворон:");
        int cnt = Integer.parseInt(reader.readLine());
        String result;
        String prefix = "";
        int n1 = cnt % 10;
        int n2 = cnt % 100;
        
        if (n2 >= 11 && n2 <= 14){
            prefix = "ворон";
        }else{
            if (cnt >= 0){
             switch(cnt % 10){
                case 1: prefix = "ворона";
                        break;
                case 2:
                case 3:
                case 4: prefix = "вороны";
                        break;
                case 0:
                case 5:
                case 6:
                case 7: 
                case 8:
                case 9:
                case 10: prefix = "ворон"; 
             }
            }else{
                System.out.println("Вы ввели некоректное число");
            }
        
     }
        result = String.format("На ветке %d %s\n", cnt,prefix);
        System.out.println(result);

        
        
    }
    
}
