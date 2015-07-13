package abstractFactory;

/**
 * Created by Zornitsa Petkova on 7/13/15.
 */
public class Reflection {

  public <T extends HousePart>T instance(Class<T> instance){
    T part = null;
    try{
      String name = instance.getName();
      Class housePart = Class.forName(name);
      part = (T)housePart.newInstance();
    }catch (Exception e){
      System.out.println(e);
    }
    return part;
  }
}
