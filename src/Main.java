public class Main {
    public static void main(String[] args) {

        Hamburger burger1 = new Hamburger();
        burger1.topping1("chees", 2);
        burger1.topping2("tomato", 1);
        burger1.topping3("lettuce", 1);
        burger1.topping4("onion", 1);
        System.out.println("final price is "+ burger1.BurgerPrice()+ " $");

        HealthyBurger healthyBurger1 = new HealthyBurger("HealthyBurger", "Oat bread", "Chiken meat", 15);
        healthyBurger1.HealthyTopping1("lettuce",1);
        healthyBurger1.HealthyTopping2("tomato",1);
        System.out.println("final price is "+ healthyBurger1.BurgerPrice());

        DeluxeBurger deluxeBurger1 = new DeluxeBurger();
        System.out.println("final price with chips and soda is "+deluxeBurger1.BurgerPrice()+" $");

    }
}