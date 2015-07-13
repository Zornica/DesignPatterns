package abstractFactory;


/**
 * Created by Zornitsa Petkova on 7/13/15.
 */
public class ReflectionDemo {
  public static void main(String[] args) {
    Reflection reflection = new Reflection();
    HousePart part = reflection.instance(Window.class);
    part.create();
  }
}
