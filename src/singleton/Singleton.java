package singleton;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class Singleton {
  private static Singleton instance = new Singleton();

  private Singleton() {
    System.out.println("Singleton created!");
  }

  public static Singleton getInstance() {
    return instance;
  }
}
