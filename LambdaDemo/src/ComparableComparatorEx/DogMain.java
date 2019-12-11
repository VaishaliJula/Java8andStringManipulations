package ComparableComparatorEx;

import java.util.ArrayList;
import java.util.Collections;

public class DogMain {
    public static void main(String[] args){

        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("Hello", 15));
        arrayList.add(new Dog("Johnny", 11));

        Collections.sort(arrayList);
        for(Dog dog:arrayList){
            System.out.println(dog.name + dog.age);
        }

    }
}
