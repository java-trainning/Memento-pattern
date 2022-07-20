package lk.dasith.momento;

public class Application {

    public static void main(String[] args) {

        OrderHistory orderHistory = new OrderHistory();

        Order order = new Order();
        order.addMeal(new Meal("fied rice"));
        order.addMeal(new Meal("kottu"));
        orderHistory.save(order);
        System.out.println(order);

        order.addMeal(new Meal("nasiguran"));
        orderHistory.save(order);
        System.out.println(order);

        order.addMeal(new Meal("watalappan"));
        orderHistory.save(order);
        System.out.println(order);

        orderHistory.revers(order);
    }
}
