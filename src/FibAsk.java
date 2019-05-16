/**
 * @author Steven Carleton
 */
import javax.swing.JOptionPane;
public class FibAsk
{
   public static void main (String[] args)
   {
      int ask;
      long FibA = 0;
      long FibB = 1;
      try {
         ask = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Positive integer."));
         System.out.println("You entered " + ask);
         if (ask > 0) {
            for (int i = 0; i < ask; i++) {
               long sum = FibA + FibB;
               FibA = FibB;
               FibB = sum;
            }
            System.out.println("The number at that point in the sequence is " + FibA);
         }
         else {
            JOptionPane.showMessageDialog(null, "Unexpected Input.");
         }
         System.exit(0);
      }
      catch (Exception err) {
         JOptionPane.showMessageDialog(null, "Unexpected Input.");
      }
      finally {
         System.out.println("Thank you for using FibAsk.");
         System.exit(0);

      }
   }
}
