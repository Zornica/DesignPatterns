package abstractFactory;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class Demo {
  public static void main(String[] args) {
    AbstractFactory partFactory = FactoryProducer.getFactory("Part");

    HousePart window = partFactory.getHousePart("Window");
    window.create();


    HousePart door = partFactory.getHousePart("Door");
    door.create();



  }
}
