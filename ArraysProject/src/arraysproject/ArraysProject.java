
package arraysproject;

import java.util.Arrays;


public class ArraysProject {

    public static void main(String[] args) {
        int size = 3;
        int[] m = new int[size];
        m[0] = 12;
        m[1] = 34;
        System.out.println(m[1]);
        System.out.println(m[2]);
        System.out.println(m.length);
        
        int[] m1 = new int[]{1,2,3};
        
        String[] names = new String[]{"Sergey", "Fedor", "Yana", "Sasha"};
        Arrays.sort(names);
        for(int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }
        
        int[][] m2 = new int[][]{{1,2,3},{4,5}};
        for(int i = 0; i < m2.length; i++){
            for(int j = 0; j < m2[i].length; j++){
                System.out.printf("%3d ",m2[i][j]);
            }
            System.out.println("");
        }
        {
            {
              int a = 10;
              int b = a;
              a = 11; 
              System.out.printf("a = %d; b = %d;\n",a,b);
            }
            {
              int[] a1 = new int[]{10};
              int[] b1 = a1;
              a1[0] = 11;
              System.out.printf("a = %d; b = %d;\n",a1[0],b1[0]);
            }
        
        }
    }
    
}
