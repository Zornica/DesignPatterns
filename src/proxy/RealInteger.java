package proxy;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class RealInteger implements Integer{
  private int number;
  private Display display;
  public RealInteger(int number) {
    this.number = number;
    display = new RealDisplay();
  }
  @Override
  public void display() {
    display.display(number);
  }
}
