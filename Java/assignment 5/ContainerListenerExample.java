import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ContainerListenerExample 
{
  public static void main(String args[]) 
	{
    JFrame frame = new JFrame();
    Container contentPane = frame.getContentPane();

    ContainerListener cont = new ContainerListener() {
      ActionListener listener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("Selected: " + e.getActionCommand());
        }
      };

      public void componentAdded(ContainerEvent e) {
        Component c = e.getChild();
        if (c instanceof JButton) {
          JButton b = (JButton) c;
          b.addActionListener(listener);
        }
      }

      public void componentRemoved(ContainerEvent e) {
        Component c = e.getChild();
        if (c instanceof JButton) {
          JButton b = (JButton) c;
          b.removeActionListener(listener);
        }
      }
    };

    contentPane.addContainerListener(cont);

    contentPane.setLayout(new GridLayout(3, 2));
    contentPane.add(new JButton("First"));
    contentPane.add(new JButton("Second"));
    contentPane.add(new JButton("Third"));
    contentPane.add(new JButton("Fourth"));
    contentPane.add(new JButton("Fifth"));

    frame.setSize(300, 200);
    frame.show();
  }
}