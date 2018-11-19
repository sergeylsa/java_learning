
package oop_home_work;

import java.util.ArrayList;
import java.util.List;


public class Person {
    
    private String name;
    private int age;
    private static int counter;
    
    public static List<Person> pers = new ArrayList<Person>();
    
    public Person(){
       this("Unknown", 18);
    }
    public Person(String name, int age){
        this.age = age;
        this.name = name;
        pers.add(this);
        counter++;
    }
    

    public void show(){
        System.out.printf("My name is %s, my age %d years old \n", this.name, this.age);
    }
    
    public static void showAll(){
      
        System.out.printf("Created %d exemplares: \n", counter);
        System.out.println("=====================");
        for(Person p : pers){
            p.show();
        }
        
        
    }
    
    //getters and setters
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
    
        return this.age;
    }
    
    public String getName(){
    
        return this.name;
    }
    
}
