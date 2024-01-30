public class Hamburger {

    private String meatType;
    private String breadType;
    private double basePrice;
    private double totalPrice;
    private String name;

    private String topping1;
    private double topping1Price;

    private String topping2;
    private double topping2Price;

    private String topping3;
    private double topping3Price;

    private String topping4;
    private double topping4Price;

    public Hamburger(String name, String breadType, String meatType, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public Hamburger() {
        this("Simple Burger","Mac Bread","lamb meat",20);
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void topping1(String topping, double price) {
        this.topping1 = topping;
        this.topping1Price = price;
        System.out.println("added " + topping1 + " for " + topping1Price + " $");
    }

    public void topping2(String topping, double price) {
        this.topping2 = topping;
        this.topping2Price = price;
        System.out.println("added " + topping2 + " for " + topping2Price+ " $");
    }

    public void topping3(String topping, double price) {
        this.topping3 = topping;
        this.topping3Price = price;
        System.out.println("added " + topping3 + " for " + topping3Price+ " $");
    }

    public void topping4(String topping, double price) {
        this.topping4 = topping;
        this.topping4Price = price;
        System.out.println("added " + topping4 + " for " + topping4Price+ " $");
    }

    public double BurgerPrice() {
        System.out.println(name + " include " + breadType + " and " + meatType + " for " + basePrice + " $ ");
        if (topping1 != null) {
            totalPrice = basePrice + topping1Price;
        }
        if (topping2 != null) {
            totalPrice = basePrice + topping1Price + topping2Price;
        }
        if (topping3 != null) {
            totalPrice = basePrice + topping1Price + topping2Price + topping3Price;
        }
        if (topping4 != null) {
            totalPrice = basePrice + topping1Price + topping2Price + topping3Price + topping4Price;
        }
        return totalPrice;
    }
}