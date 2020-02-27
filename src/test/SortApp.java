package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortApp {
    public static void main(String args[]) {

        Person[] persons = new Person[4];
        persons[0] = new Person("Chen",34);
        persons[1] = new Person("Liu",21);
        persons[2] = new Person("Xu",45);
        persons[3] = new Person("Hu",13);

        for (int i=persons.length-1;i>0; i--) {
            for (int j=0;j<i;j++) {
                if (persons[j].getAge()>persons[j+1].getAge()) {
                    Person p = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = p;
                }
            }
        }

        for (int i=0; i<persons.length;i++) {
            System.out.println(persons[i].getName()+","+persons[i].getAge());
        }

        System.out.println("名字排序：");
        Sortname.pai(persons);
    }

}
