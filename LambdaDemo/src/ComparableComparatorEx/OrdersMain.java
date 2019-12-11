package ComparableComparatorEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdersMain {

    public static void main(String[] args) {

        List<Orders> list = new ArrayList<>();
        list.add(new Orders("vaishali.jula", 10, "12-12-1999", 210.0));
        list.add(new Orders("Shalini.jula", 10, "12-12-1999", 201.0));

        Collections.sort(list, new AmountComparator());
        for(Orders orders: list){
            System.out.println(orders.amount);
        }

    }
}
