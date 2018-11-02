
package collection_;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Collection_ {

    public static void main(String[] args) {
          //Collections only type referencetype 
          List<String> persons = new ArrayList<String>();
          persons.add("Sergey");
          persons.add("Yana");
          persons.add("Kora");
          
          if (persons.contains("Sergey1")){
                persons.set(2, "lyashenko Kora");  
          }
          
          Collections.sort(persons);
          //Collections.reverse(persons);
          for(int i = 0; i < persons.size(); i++){
              System.out.println(persons.get(i));
          }

          
          Collection<String> names = persons;
          
          //Устаревший вариант
          //Iterator отвечает за переборку елементов неупорядоченой коллекции 
//          Iterator<String> iter = names.iterator();
//          while (iter.hasNext()){
//              String name = iter.next();
//              System.out.println(name);
//          }
          
          //Новый вариант перебора неупорядоченной коллекции
          for(String name :names){
              System.out.println(name);
          }
          
          
 
           
          
    }
    
}
