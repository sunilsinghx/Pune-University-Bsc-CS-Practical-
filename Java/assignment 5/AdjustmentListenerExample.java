import javax.swing.*;
import java.awt.event.*;

public class AdjustmentListenerExample 
{
  public static void main(String[] args) 
{
    JFrame frame = new JFrame("AdjustmentListenerExample");
    JLabel label = new JLabel("Welcome To JavaTips.net");
    JScrollbar hbar = new JScrollbar(Scrollbar.HORIZONTAL, 30, 20, 0, 300);
    JScrollbar vbar = new JScrollbar(Scrollbar.VERTICAL, 30, 40, 0, 300);
    frame.setLayout(new BorderLayout());
    frame.add(hbar, BorderLayout.SOUTH);
    frame.add(vbar, BorderLayout.EAST);
    frame.add(label, BorderLayout.CENTER);
    AdjustmentListener adjustmentListener = new MyAdjustmentListener();
    hbar.addAdjustmentListener(adjustmentListener);
    vbar.addAdjustmentListener(adjustmentListener);
    frame.setSize(400, 400);
    frame.setVisible(true);
   
  }
}

class MyAdjustmentListener implements AdjustmentListener 
{
  public void adjustmentValueChanged(AdjustmentEvent ae) 
{
    System.out.println(ae.getValue());
  }
}