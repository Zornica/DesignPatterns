package abstractfactory;

/**
 * Created by Zornitsa Petkova on 7/13/15.
 */
public class ReflectionFactory {

  public <T extends HousePart> T instance(String name) {
    T part = null;
    try {
      Class housePart = Class.forName(name);
      part = (T) housePart.newInstance();
    } catch (Exception e) {
      System.out.println(e);
    }
    return part;
  }
}
