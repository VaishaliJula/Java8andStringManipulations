package ComparableComparatorEx;

import java.util.ArrayList;
import java.util.Collections;

public class ElephantMain {

    public static void main(String args[]){

        ArrayList<Elephant> arrayList = new ArrayList<>();
        arrayList.add(new Elephant("Hello", 15));
        arrayList.add(new Elephant("Johnny", 11));

        System.out.println("Sorting by Name");
        Collections.sort(arrayList, new NameComparator());
        for(Elephant elephantName:arrayList){
            System.out.println(elephantName.name + elephantName.age);
        }


        System.out.println("Sorting by Age");
        Collections.sort(arrayList, new AgeComparator());
        for(Elephant elephantAge:arrayList){
            System.out.println(elephantAge.name + elephantAge.age);
        }

    }
    }
