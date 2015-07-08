package proxy;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class Demo {
  public static void main(String[] args) {
    Integer integer=new IntegerProxy(1);
    integer.display();
  }
}
