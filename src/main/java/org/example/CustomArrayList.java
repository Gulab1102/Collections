package org.example;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList<String>{
    @Override
    public boolean add(String o) {

        if(this.contains(o))return true;
        return super.add(o);

//        return super.add(o);
    }

    public static void main(String[] args) {

        CustomArrayList customArrayList=new CustomArrayList();

        customArrayList.add("Gulab");
        customArrayList.add("Priya");
        customArrayList.add("Gulab");

        System.out.println(customArrayList);




    }
}
