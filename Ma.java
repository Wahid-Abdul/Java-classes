import java.util.*;

public class Ma {

   public static void main(String args[]) {
      /* Vector of initial capacity(size) of 2 */
      Vector<String> vec = new Vector<String>(2);

      /* Adding elements to a vector*/
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Fig");

      /* check size and capacityIncrement*/
      System.out.println("Size is: "+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());
      String[] s = new String[10];
      s = new String[] {"hi","ki"};
      vec.addAll(Arrays.asList(s));
      vec.addElement("fruit1");
      vec.addElement("fruit2");
      vec.addElement("fruit3");

      Enumeration e = vec.elements();
      while(e.hasMoreElements())
      {
        System.out.println(e.nextElement());
      }
      System.out.println("Size after addition: "+vec.get(0));
   }
}
