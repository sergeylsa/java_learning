
package oop;

public class Person {
    
    public String name = "Незнакомец";
    public int age = 18;
    
    public Person(){
       this("Uncnown");
    }
    
    public Person(String name){
        this(name, 18);
    }
    
    public Person(String name, int age){
       this.age = age;
       this.name = name;
    }
    
    public void show(){
        System.out.printf("name = %s - age = %d\n",this.name,this.age);
    }
    
}
