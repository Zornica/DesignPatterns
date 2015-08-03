package observer;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public interface ProductChangeListener {
  void registerProduct(Product product);

  void soldProduct(Product product);
}
