package abstractfactory;


/**
 * Created by Zornitsa Petkova on 7/13/15.
 */
public class ReflectionDemo {
  public static void main(String[] args) {
    ReflectionFactory reflectionFactory = new ReflectionFactory();
    HousePart part = reflectionFactory.instance("abstractfactory.Window");
    part.create();
  }
}
