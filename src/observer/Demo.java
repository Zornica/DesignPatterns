package observer;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public class Demo {
  public static void main(String[] args) {

    AvailableProducts availableProducts = new AvailableProducts();
    SoldProducts soldProducts = new SoldProducts();

    Store store = new Store();
    store.addListener(availableProducts);
    store.addListener(soldProducts);

    Apple apple = new Apple();
    Banana banana = new Banana();
    store.registerProduct(apple);
    store.registerProduct(new Apple());
    store.registerProduct(banana);

    System.out.println("In store has: ");
    for (Product product : availableProducts.getList()) {
      System.out.println(product.getName());
    }

    store.saleProduct(apple);

    System.out.println("In moment are  available: ");
    for (Product product : availableProducts.getList()) {
      System.out.println(product.getName());
    }

  }
}
