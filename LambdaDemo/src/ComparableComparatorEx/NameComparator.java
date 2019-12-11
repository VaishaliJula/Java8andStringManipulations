package ComparableComparatorEx;

import java.util.Comparator;

public class NameComparator implements Comparator<Elephant> {

    public int compare(Elephant e1, Elephant e2){
        return e1.name.compareTo(e2.name);
    }
}
