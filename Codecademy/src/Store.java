public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  double price;
  
  // constructor method
  public Store(String product, int count, double price, double initialPrice) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
    price = initialPrice;
  }
  
  // advertise method
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }

  public void greetCustomer(String customer) {
    System.out.println("Welcome to the store, " + customer + "!");
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price +  priceToAdd;
    price = newPrice;
  }

    // get price with tax method
    public double getPriceWithTax() {
      double totalPrice = price + price * 0.08;
      return totalPrice;
    }

    public String toString() {
      return "This store sells " + productType + " at a price of " + price + ".";
    }


  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    
    lemonadeStand.advertise();
    cookieShop.advertise();
    lemonadeStand.greetCustomer("Nhat");

    Store lemonadeStand = new Store("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);

    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);

    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}


