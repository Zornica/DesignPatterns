package proxy;

/**
 * Created by Zornitsa Petkova on 7/8/15.
 */
public class IntegerFactory {

  public RealInteger createInstance(int number){
    return new RealInteger(number);
  }

}
