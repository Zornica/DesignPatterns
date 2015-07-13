package reflection;

/**
 * Created by Zornitsa Petkova on 7/13/15.
 */
public class Demo {
  public static void main(String[] args) {
    Reflection reflection = new Reflection();
    House woodenHouse = reflection.instance(WoodenHouse.class);
    System.out.println(woodenHouse.create());
  }
}
