
package oop;

public class OOP {

    public static void main(String[] args) {
       Person p = new Person();
       p.age = 10;
       p.name = "Sergey";
       p.show();
       
       Person p2 = new Person("Vasya",46);
       //p2.name = "Kostya";
       //p2.age = 18;
       p2.show();
    }
    
}
//01:18:44