package MovingSprites;
/**
 * @author Steven Carleton
 */
import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingSpritesEx extends JFrame
{

   public MovingSpritesEx ()
   {
      initUI();
   }

   private void initUI ()
   {

      add(new Board());

      setTitle("Moving sprites");
      setSize(1000, 1000);

      setLocationRelativeTo(null);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main (String[] args)
   {

      EventQueue.invokeLater(() -> {
         MovingSpritesEx ex = new MovingSpritesEx();
         ex.setVisible(true);
      });
   }
}
