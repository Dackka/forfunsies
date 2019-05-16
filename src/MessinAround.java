import java.util.Random;
/**
 * @author Steven Carleton
 */
public class MessinAround
{
   public static void main (String[] args)
   {
      Random r1 = new Random();
      int q = 0;
      int y = 0;
      while (q != 1234) {
         q = r1.nextInt(1235);
         y++;
         System.out.println(q);
      }
      System.out.println(y + ":)");
      String output = "";
      for (int a = 0; a < 10; a++) {
         for (int b = 0; b < 10; b++) {
            output += b;
         }
         output += "\n" + a + "\n";
      }
      System.out.println(output);
   }
}
