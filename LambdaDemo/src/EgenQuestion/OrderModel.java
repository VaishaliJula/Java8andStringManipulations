package EgenQuestion;

public class OrderModel implements Comparable<OrderModel> {

     String email;
     long orderId;
     String  date;
     double amount;

    public OrderModel(String email, long orderId, String date, double amount) {
        this.email = email;
        this.orderId = orderId;
        this.date = date;
        this.amount = amount;
    }


    @Override
    public int compareTo(OrderModel o) {
        if(amount == o.amount){
            return 0;
        }else if(amount > o.amount){
            return 1;
        }else
            return -1;
    }
}
