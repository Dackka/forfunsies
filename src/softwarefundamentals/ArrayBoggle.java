package softwarefundamentals;
import java.util.Scanner;
/**
 * @author Steven Carleton
 */
public class ArrayBoggle
{
   public static String[] boggle;

   public static void main (String[] args)
   {
      boggle = new String[7];
      String input;
      Scanner scan = new Scanner(System.in);
      System.out.println("Please Enter a 7 letter word:");
      input = scan.nextLine();
      for (int i = boggle.length - 1; i >= 0; i--) {
         boggle[i] = input.substring(i);
         input += "\b";
         System.out.print(boggle[i]);
      }
//      for (int i = boggle.length - 1; i >= 0; i--) {
//         System.out.println(boggle[i]);
//      }
   }
}
