
package methods_pactice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;


public class Methods_pactice {

    public static List<String> getSortedNames(String... names){
       List<String> listNames = Arrays.asList(names);
       Collections.sort(listNames);
       return listNames;
        
        
    }
    public static void main(String[] args) {
        List<String> names;
        names = getSortedNames("Яна", "Сергей","Петр", "Валентина", "Александр");
        for(String n : names){
            System.out.println(n);
        }
    }
    
}
