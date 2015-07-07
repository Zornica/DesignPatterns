package proxy;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class IntegerProxy implements Integer {
  private int number;
  private RealInteger realInteger;
  public IntegerProxy(int number) {
    this.number = number;
  }
  @Override
  public void display() {
    if(realInteger==null){
      realInteger=new RealInteger(number);
    }
    realInteger.display();
  }
}
