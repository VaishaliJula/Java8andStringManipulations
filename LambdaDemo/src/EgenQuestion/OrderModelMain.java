package EgenQuestion;

import java.util.*;

public class OrderModelMain {

    public static void main(String[] args) {

        List<OrderModel> list = new ArrayList<>();
        list.add(new OrderModel("vaishali.jula", 10, "12-12-1999", 310.0));
        list.add(new OrderModel("Shalini.jula", 10, "12-12-1999", 201.0));
        list.add(new OrderModel("Shalini.jula", 10, "12-12-1999", 300.0));

        Collections.sort(list);
        Map<String , Double> map = new HashMap<>();

        for (OrderModel orderModel:
             list) {
            System.out.println(orderModel.amount);
            if(map.containsKey(orderModel.email)){
                map.put(orderModel.email, (map.get(orderModel.email) + orderModel.amount));

            }else {
                map.put(orderModel.email, orderModel.amount);
            }

        }
        System.out.println(map);
        Optional<Map.Entry<String, Double>> optionalStringDoubleEntry = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));

    }
}
