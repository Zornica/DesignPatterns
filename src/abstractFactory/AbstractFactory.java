package abstractFactory;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public abstract class AbstractFactory {

  abstract Color getColor(String color);

  abstract HousePart getHousePart(String part);
}
