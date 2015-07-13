package observer;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public class Demo {
  public static void main(String[] args) {

    AvailableProducts availableProducts = new AvailableProducts();
    SoldProducts soldProducts = new SoldProducts();

    Store store = new Store();
    store.addInList(availableProducts);
    store.addInList(soldProducts);

    Apple apple = new Apple();
    Banana banana = new Banana();
    store.registerProduct(apple);
    store.registerProduct(banana);

    System.out.println("In store has: ");
    for (Product product : availableProducts.getList()) {
      System.out.println(product.getName());
    }

    store.saleProduct(apple);

    System.out.println("In moment not available: ");
    for (Product product : soldProducts.getList()) {
      System.out.println(product.getName());
    }

  }
}
