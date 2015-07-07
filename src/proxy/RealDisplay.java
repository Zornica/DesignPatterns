package proxy;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class RealDisplay implements Display {
  @Override
  public void display(int number) {
    System.out.println(this.getClass().getSimpleName()+ " - "+number);
  }
}
