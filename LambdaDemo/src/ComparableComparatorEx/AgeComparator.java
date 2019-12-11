package ComparableComparatorEx;

import java.util.Comparator;

public class AgeComparator implements Comparator<Elephant> {

    public int compare(Elephant e1,Elephant e2){
        if(e1.age==e2.age)
            return 0;
        else if(e1.age>e2.age)
            return 1;
        else
            return -1;
    }
}
