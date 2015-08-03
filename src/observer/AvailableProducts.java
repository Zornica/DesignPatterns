package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public class AvailableProducts implements ProductChangeListener {

  List<Product> availableProducts = new ArrayList<Product>();

  @Override
  public void registerProduct(Product product) {
    availableProducts.add(product);
  }

  @Override
  public void soldProduct(Product product) {
    availableProducts.remove(product);
  }

  public List<Product> getList() {
    return availableProducts;
  }


}
