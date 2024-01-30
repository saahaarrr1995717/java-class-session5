public class HealthyBurger extends Hamburger {
    private String healthyTopping1;
    private double healthyTopping1Price;

    private String healthyTopping2;
    private double healthyTopping2Price;

    public HealthyBurger(String name, String breadType, String meatType, double basePrice) {
        super("Healty Burger", "Oat Bread", "Chiken meat", 15);
    }

    public void HealthyTopping1(String topping, double price) {
        this.healthyTopping1 = topping;
        this.healthyTopping1Price = price;
        System.out.println("added " + healthyTopping1 + " for " + healthyTopping1Price + " $");
    }

    public void HealthyTopping2(String topping, double price) {
        this.healthyTopping2 = topping;
        this.healthyTopping2Price = price;
        System.out.println("added " + healthyTopping2 + " for " + healthyTopping2Price + " $");
    }

    @Override
    public double BurgerPrice() {
        double healtyBurgerPrice = super.BurgerPrice();
        if (healthyTopping1 != null) {
            healtyBurgerPrice = healthyTopping1Price + getBasePrice() ;
        }
        if (healthyTopping2 != null) {
            healtyBurgerPrice = healthyTopping1Price + healthyTopping2Price + getBasePrice();
        }
        return healtyBurgerPrice;
    }
}
