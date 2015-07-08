package proxy;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class IntegerProxy implements Integer {
  private int number;
  private RealInteger realInteger;
  private IntegerFactory factory;
  public IntegerProxy(int number) {
    this.number = number;
  }
  @Override
  public void display() {
    if(realInteger==null){
     /* realInteger=factory.createInstance(number);*/
      realInteger = new RealInteger(number);
    }
    realInteger.display();
  }
}
