package lk.dasith.momento;

import java.util.ArrayList;

//originator
public class Order {

    ArrayList<Meal> meals =  new ArrayList<>();

    public void addMeal(Meal meal){
        meals.add(meal);
    }

    public ArrayList<Meal> getMeals() {
        return (ArrayList) meals.clone();
    }

    public OrderMomento save(){
        return new OrderMomento(getMeals());
    }

    public void revers(OrderMomento orderMomento){
        meals = orderMomento.getMeals();
    }

    @Override
    public String toString() {
        return "Order{" +
                "meals=" + meals +
                '}';
    }

    static class OrderMomento{

        ArrayList<Meal> meals;

        public OrderMomento(ArrayList<Meal> meals){
            this.meals = meals;
        }

        private  ArrayList<Meal> getMeals(){
            return meals;
        }
    }


}
