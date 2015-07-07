package pool;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class PoolTest {

  private Integer a,b,c,d;
  Pool pool;

  @Before
  public void SetUp(){
   pool = new Pool();
  }

  @Test
  public void happyPath(){
    try{
    a= (Integer)pool.acquire();
      b=(Integer)pool.acquire();
      c=(Integer)pool.acquire();
      pool.release(c);
      d=(Integer)pool.acquire();
      assertThat(a, is(1));
      assertThat(b, is(2));
      assertThat(c, is(3));
      assertThat(d, is(3));
    }catch (NotAvailableObjectException e){
      System.out.println(e.getMessage());
    }

  }

  @Test
  public void exceptionPath(){
    try{
      a= (Integer)pool.acquire();
      b=(Integer)pool.acquire();
      c=(Integer)pool.acquire();
      d=(Integer)pool.acquire();
    }catch (NotAvailableObjectException e){
      System.out.println(e.getMessage());
    }
  }
}
