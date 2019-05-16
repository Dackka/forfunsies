package Imaging;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * @author Steven Carleton
 */
public class MakeImage extends JFrame
{
   public MakeImage ()
   {

      initUI();
   }

   private void initUI ()
   {

      ImageIcon ii = loadImage();

      JLabel label = new JLabel(ii);

      createLayout(label);

      setTitle("Image");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   private ImageIcon loadImage ()
   {

      ImageIcon ii = new ImageIcon("src/images/deargodwhy.jpg");
      return ii;
   }

   private void createLayout (JComponent... arg)
   {

      Container pane = getContentPane();
      GroupLayout gl = new GroupLayout(pane);
      pane.setLayout(gl);

      gl.setAutoCreateContainerGaps(true);

      gl.setHorizontalGroup(gl.createSequentialGroup()
              .addComponent(arg[0])
      );

      gl.setVerticalGroup(gl.createParallelGroup()
              .addComponent(arg[0])
      );

      pack();
   }

   public static void main (String[] args)
   {

      EventQueue.invokeLater(() -> {
         MakeImage ex = new MakeImage();
         ex.setVisible(true);
      });
   }
}