package lk.dasith.momento;

import java.util.Stack;

public class OrderHistory {

    Stack<Order.OrderMomento> history = new Stack<>();


    public void save(Order order){
        history.push(order.save());
    }

    public void revers(Order order){
        if (!history.isEmpty()){
            order.revers(history.pop());
        }else{
            System.out.println("orders are empty");
        }
    }
}
