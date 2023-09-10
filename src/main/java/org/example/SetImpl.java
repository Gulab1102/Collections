package org.example;


import java.util.*;

//class Emplyees implements  Comparable<Emplyees>{
//    int id;
//    String name;
//    String role;
//
//
//
//    @Override
//    public String toString() {
//        return "Emplyees{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", role='" + role + '\'' +
//                '}';
//    }
//
//
//    @Override
//    public int compareTo(Emplyees o) {
//        if(this.id==o.id)return this.name.compareTo(o.name);
//        return this.id-o.id;
//    }
//}


class Emplyees implements  Comparable<Emplyees>{
    int id;
    String name;
    String role;



    @Override
    public String toString() {
        return "Emplyees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


    @Override
    public int compareTo(Emplyees o) {
        return this.id-o.id;
    }
}

class IdCom implements  Comparator<Emplyees>{

    @Override
    public int compare(Emplyees o1, Emplyees o2) {
        return o1.id-o2.id;
    }
}

public class SetImpl {



    public static void main(String[] args) {

        Set<Emplyees> emplyeeSet=new TreeSet<>();


        List<Emplyees>emplyeesList=new ArrayList<>();


        Emplyees e1=new Emplyees();
        e1.id=2;
        e1.name="Gulab";
        e1.role="ADMIN";
        emplyeeSet.add(e1);

        Emplyees e2=new Emplyees();

        e2.id=1;
        e2.name="Priya";
        e2.role="ADMIN";

        Emplyees e3=new Emplyees();

        e3.id=1;
        e3.name="Nandani";
        e3.role="ADMIN";
        emplyeeSet.add(e2);
        System.out.println(emplyeeSet);

        emplyeesList.add(e1);
        emplyeesList.add(e2);
        emplyeesList.add(e3);
        emplyeeSet.add(e3);

         List<Integer> temp=new ArrayList<>();

         temp.add(1);
         temp.add(0);
         temp.add(10);
         temp.add(5);
        // temp.sort();
        System.out.println(temp);
        Collections.sort(temp);
        System.out.println(emplyeesList);

        Collections.sort(emplyeesList,new IdCom());
        System.out.println(emplyeesList);
//
//        temp.add("Gulab");
//        temp.add("Nandani");
//        temp.add("Priya");
//        temp.add("Saloni");






    }
}
