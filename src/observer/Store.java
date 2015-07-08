package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public class Store {

  List<Observer> observerList = new ArrayList<Observer>();

  public void saleProduct(Product product) {
    for (Observer observer : observerList) {
      observer.soldProduct(product);
    }
  }

  public void registerProduct(Product product) {
    for (Observer observer : observerList) {
      observer.registerProduct(product);
    }
  }

  public void addInList(Observer observer) {
    observerList.add(observer);
  }
}
