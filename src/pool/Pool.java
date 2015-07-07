package pool;

/**
 * Created by Zornitsa Petkova on 7/7/15.
 */
public class Pool {
  private int index;
  private Object[] array = {1, 2, 3};
  private int i = 0;


  public Pool() {
    this.index = array.length;
  }

  public Object acquire() throws NotAvailableObjectException {
    if (i < index) {
      Object object = array[i];
      array[i] = null;
      i++;
      return object;
    } else {
      throw new NotAvailableObjectException("Not available object in this array!");
    }
  }

  public void release(Object object) {
    for ( i = 0; i < index; i++) {
      if (array[i] == null) {
        array[i] = object;
        break;
      }
    }
  }
}
