package org.example;


import java.util.*;

class Emplyee{
 int id;
 String name;
 String role;

    @Override
    public int hashCode() {
     //   return super.hashCode(name,id,role);

        return Objects.hash(id,name,role);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;

        Emplyee e= (Emplyee) obj;
        if(this.id==((Emplyee) obj).id&&this.name==((Emplyee) obj).name&&this.role==((Emplyee) obj).role)
            return true;
        return false;
    }

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
        Set<Emplyee> emplyeeSet=new HashSet<>();

        Map map=new HashMap();
        Emplyee e1=new Emplyee();
        e1.id=1;
        e1.name="Gulab";
        e1.role="ADMIN";

        Emplyee e2=new Emplyee();
        e2.id=1;
        e2.name="Gulab";
        e2.role="ADMIN";

        emplyeeSet.add(e1);
//        emplyeeSet.add(e2);
        map.put(e1,9);
        System.out.println(emplyeeSet.contains(e2));

        map.forEach((k,v)->{
            System.out.println(v);
        });

//        temp.forEach(name->{
          //  System.out.println(temp);
//        });




    }
}