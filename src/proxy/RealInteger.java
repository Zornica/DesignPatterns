package proxy;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class RealInteger implements Integer{
  private int number;
  /*private IntegerFactory factory;*/

  public RealInteger(int number) {
    this.number = number;
  /*  display = factory.createInstance();*/

  }
  @Override
  public void display() {
    /*display.display(number);*/
    System.out.println("The class "+this.getClass().getSimpleName() + " shows the number "+ number);
  }
}
