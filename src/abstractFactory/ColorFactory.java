package abstractFactory;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class ColorFactory extends AbstractFactory {
  @Override
  public HousePart getHousePart(String part) {
    return null;
  }

  @Override
  public Color getColor(String color) {
    if (color == null) {
      return null;
    }

    if (color.equals("White")) {
      return new White();
    } else if (color.equals("Blue")) {
      return new Blue();
    } else if (color.equals("Black")) {
      return new Black();
    }
    return null;
  }
}
