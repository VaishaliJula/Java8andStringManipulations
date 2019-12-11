package CollectionsExamples;

import java.util.*;

public class ListType {

    public static void main(String[] args){

        //List preserve insertion order
        //General declaration
        List a = new ArrayList();
        List b = new LinkedList();
        List c = new Vector();
        List d = new Stack();

        a.add("Hello");
        a.add("Bunty");
        a.add("Hi");
        System.out.println(a);


        //type-safe List can be defined in the following way:


        b.add("Hello");
        b.add("Bunty");
        b.add("Hi");
        System.out.println(b);

        c.add("Hello");
        c.add("Bunty");
        c.add("Hi");
        System.out.println(c);

        d.add("Hello");
        d.add("Bunty");
        d.add("Hi");
        System.out.println(d);

    }
}
