import java.util.*;
class Stringtest{
    public static void main(String args[]){
      String str = "i am a +cool,king";
      StringTokenizer s = new StringTokenizer(str,"+, a");
      while(s.hasMoreTokens())
      {
        System.out.println(s.nextToken());
      }
    }
}
