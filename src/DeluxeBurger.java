public class DeluxeBurger extends Hamburger{
    private String deluxeTopping1;
    private Double deluxeTopping1Price;

    private String deluxeTopping2;
    private Double deluxeTopping2Price;

    public DeluxeBurger() {
        super("Deluxe Burger ", "Mac Bread", "lamb meat", 20);
        super.topping1("chips", 3);
        super.topping2("soda", 2);
    }

        public void topping1 (String topping,double price){
            this.deluxeTopping1 = topping;
            this.deluxeTopping1Price = price;
            System.out.println(" added " + deluxeTopping1 + " for " + deluxeTopping1Price + " $");
        }

        public void topping2 (String topping,double price){
            this.deluxeTopping2 = topping;
            this.deluxeTopping2Price = price;
            System.out.println(" added " + deluxeTopping2 + " for " + deluxeTopping2Price + " $");
        }

}
