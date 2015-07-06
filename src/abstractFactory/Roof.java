package abstractFactory;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class Roof implements HousePart {
  @Override
  public void create(){
    System.out.println("Create roof!");
  }
}
