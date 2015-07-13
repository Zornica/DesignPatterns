package reflection;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Zornitsa Petkova on 7/13/15.
 */
public class Demo {
  public static void main(String[] args) {
   try{
     Class house = Class.forName("WoodenHouse");
     WoodenHouse woodenHouse =(WoodenHouse)house.newInstance();
     System.out.println(woodenHouse.create());
   }catch (ClassNotFoundException cl){
     cl.getStackTrace();
   }catch (InstantiationException in){
     in.getStackTrace();
   }catch (IllegalAccessException ill){
     ill.getStackTrace();
   }

  }
}
