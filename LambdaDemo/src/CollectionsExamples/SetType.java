package CollectionsExamples;

import java.util.*;

public class SetType {

    public static void main(String[] args){

        Set<String> hash_set1 = new HashSet<>();
        hash_set1.add("Vaishu");
        hash_set1.add("Shalu");
        hash_set1.add("Vaishu");
        hash_set1.add("Sonu");

        //Hash_set eliminates duplicates but no sorting or no insertion order
        //uses equals() and hashCode()
        System.out.println("Result of hash_set");
        System.out.println(hash_set1);

        //Linked_hash_set follows insertion order
        //uses equals() and hashCode()
        System.out.println("Result of Linkedhashset");
        Set<String> linkedhash_set = new LinkedHashSet<>(hash_set1);
        System.out.println(linkedhash_set);

        //Tree eliminates duplicates and sort by natural order
        //uses compareTo and compare
        System.out.println("Result of tree_set");
        Set<String> tree_set1 = new TreeSet<>(hash_set1);
        System.out.println(tree_set1);



        //Set operations
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);




    }
}
