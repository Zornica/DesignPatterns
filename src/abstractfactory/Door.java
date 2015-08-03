package abstractfactory;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class Door implements HousePart {
  @Override
  public void create(){
    System.out.println("Create door!");
  }
}
