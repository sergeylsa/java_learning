
package inputstream_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.Scanner;

public class InputStream_practice {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do by Scanner");
        System.out.println("-------------");
        System.out.println("Enter the temperature in degrees Celsius: ");
        double tc = sc.nextDouble();
        System.out. printf("Degrees Celsius = %.2f\n", tc);
        double f = tc * 9/5 + 32;
        System.out.printf("Degrees Fahrenheit = %.2f\n\n", f);
        //sc.close();//Close Stream
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do by BufferedReader"); 
        System.out.println("--------------------");
        System.out.println("Enter the temperature in degrees Celsius: ");
        tc = Double.parseDouble(reader.readLine());
        System.out.printf("Degrees Celsius = %.2f\n", tc);
        f = tc * 9/5 + 32;
        System.out.printf("Degrees Fahrenheit = %.2f\n", f);
    } 
    
}
