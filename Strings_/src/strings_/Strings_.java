
package strings_;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Strings_ {

    public static void main(String[] args) throws IOException {
        String s1 = "Привет";
		String s2 = new String("Привет");
		char ch = s1.charAt(0); 
		out.println(s1);
		out.println(ch);
		
		String hello = "Привет";
		String name = "Сергей";
		String result = hello + " " + name;
		out.println(result);
		
		//very bad solution
		String r = "";
		for(int i = 1; i <= 100; i++){
			r += String.valueOf(i) + " ";	
		}
		out.println(r);
		
		//good solution
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i++){
			sb.append(i).append(" ");
		}
		String r1 = sb.toString();
		out.println(r1);
        
		Scanner sc = new Scanner(System.in);
		out.println("input new string: ");
		String s = sc.nextLine();
		String s3 = "Sergey";
		sc.close();
		//wrong equalse
		boolean s4 = (s3 == s);
		out.println(s4);
		//good equalse
		s4 = s3.equals(s);
		out.println(s4);
		{
			String t1 = "Привет";
			String t2 = "Привет";
			boolean b = (t1 == t2);
			
			out.println(b);
		
		}
		{
			int a = 5;
			int b = 7;
			out.printf("a = %d;\nb = %d\n", a, b);
			String name1 = "Сергей";
			String rr = String.format("Привет, %s", name1); 
			out.println(rr);
			double d = 5D/2;
                        System.out.printf("d = %.2f", d);//.2 - УКАЗЫВАЕТ КОЛИЧЕСТВО ЗНАКОВ ПОСЛЕ ЗАЯПТОЙ
                        System.out.printf("d = %.2f", d);
                        
		}
                {
                 Date now = new Date();
                 System.out.printf("\n%1$tY-%1$tB-%1$td", now);
                 System.out.printf("\n%1$tY-%1$tB-%1$td", now);//1$ - порядковый номер елемента, следующий сразу за форматирующей строкой
                                                               //t - тип выводимого значения date
                                                               //Y,B,d - год, месяц, и день
                 }                                             //https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html - ссылка на тип парамтера строки форматирования
                {
                  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                  System.out.println("\nInput random symbol: ");
                  String s5 = br.readLine();  
                  System.out.printf("You input %s \n",s5);
                  
                    System.out.println("Input number:");
                    s5 = br.readLine();
                    int a = Integer.parseInt(s5);
                }  
    
    }
    
}
