package ComparableComparatorEx;

import java.util.Comparator;

public class AmountComparator implements Comparator<Orders> {

    public int compare(Orders o1,Orders o2) {

            if(o1.amount==o2.amount)
                return 0;
            else if(o1.amount>o2.amount)
                return 1;
            else
                return -1;
    }
}
