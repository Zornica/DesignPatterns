package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public class SoldProducts implements Observer {

  List<Product> soldProducts = new ArrayList<Product>();

  @Override
  public void registerProduct(Product product) {
    if (soldProducts.contains(product)) {
      soldProducts.remove(product);
    }
  }

  @Override
  public void soldProduct(Product product) {
    soldProducts.add(product);
  }

  public List<Product> getList() {
    return soldProducts;
  }
}
