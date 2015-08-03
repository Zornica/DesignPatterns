package abstractfactory;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class FactoryProducer {
  public static AbstractFactory getFactory(String factory){

  if(factory.equals("Part")){
    return new HousePartFactory();
  }

  return null;
}
}
