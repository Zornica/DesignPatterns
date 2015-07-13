package abstractFactory;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class HousePartFactory extends  AbstractFactory {
  @Override
  public HousePart getHousePart(String part){
    if(part == null)
    return  null;

    if(part.equals("Door")){
      return new Door();
    }else if(part.equals("Window")){
      return new Window();
    }else if (part.equals("Roof")) {
      return new Roof();
    }
    return null;
  }

}
