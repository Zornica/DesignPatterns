package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public class Store {

  List<ProductChangeListener> productChangeListenerList = new ArrayList<ProductChangeListener>();

  public void saleProduct(Product product) {
    for (ProductChangeListener productChangeListener : productChangeListenerList) {
      productChangeListener.soldProduct(product);
    }
  }

  public void registerProduct(Product product) {
    for (ProductChangeListener productChangeListener : productChangeListenerList) {
      productChangeListener.registerProduct(product);
    }
  }

  public void addListener(ProductChangeListener productChangeListener) {
    productChangeListenerList.add(productChangeListener);
  }
}
