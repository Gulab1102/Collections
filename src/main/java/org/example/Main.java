package org.example;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
class Emplyee{
 int id;
 String name;
 String role;

    @Override
    public String toString() {
        return "Emplyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

      final List<Emplyee> temp=new LinkedList<>();
//
//        temp.add("Gulab");
//        temp.add("Nandani");
//        temp.add("Priya");
//        temp.add("Saloni");

        Emplyee e1=new Emplyee();
        e1.id=1;
        e1.name="Gulab";
        e1.role="ADMIN";
        temp.add(e1);

//        temp.forEach(name->{
            System.out.println(temp);
//        });




    }
}