package pool;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class Demo {

  public static void main(String[] args) {
    Pool pool = new Pool();
    try{
    Object obj = pool.acquire();
      System.out.println(obj);

      Object ob = pool.acquire();
      System.out.println(ob);

      Object object = pool.acquire();
      System.out.println(object);

      pool.release(obj);

      Object object1 = pool.acquire();
      System.out.println(object1);

    }catch (NotAvailableObjectException e){
      System.out.println(e.getMessage());
    }
  }
}
