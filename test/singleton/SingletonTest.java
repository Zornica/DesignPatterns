package singleton;




import org.junit.Test;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertThat;

/**
 * Created by Zornitsa Petkova on 7/6/15.
 */
public class SingletonTest {
  @Test
  public void testName() throws Exception {
    Singleton ref1 = Singleton.getInstance();
    Singleton ref2 = Singleton.getInstance();
    assertThat(ref1, sameInstance(ref2));
  }
}
