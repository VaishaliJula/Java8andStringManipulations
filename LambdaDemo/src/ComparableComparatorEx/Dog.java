package ComparableComparatorEx;

public class Dog implements Comparable<Dog>{

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override public int compareTo(Dog o) {

        if(age == o.age){
            return 0;
        }else if(age>o.age){
            return 1;
        }else
            return -1;
    }
}
