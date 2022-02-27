/*Write a menu driven program to perform the following operations on a set of integers as shown in the following figure. A load operation should generate 10 random integers (2 digit) and display the no on screen. The save operation should save the no to a file “number.txt”. The short menu provides various operations and the result is displayed on the screen.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class Slip4_1 extends JFrame implements ActionListener
{
                JMenu m1,m2;
                JMenuBar mb;
                JMenuItem m[];

                JLabel l;
                JTextField t;
                JPanel p;

                StringBuffer ss=new StringBuffer();

                int n;
                int arr[]=new int [20];
                Slip4_1()
                {
                                p=new JPanel();
                                mb=new JMenuBar();
                                m1=new JMenu("Operation");
                                m2=new JMenu("Compute");

                                l=new JLabel("Numbers");
                                t=new JTextField(20);

                                String str[]={"Load","Save","Exit","Sum","Average"};
                                m=new JMenuItem[str.length];
                                for(int i=0;i<str.length;i++)
                                {
                                                m[i]=new JMenuItem(str[i]);
                                                m[i].addActionListener(this);
                                }
                                p.add(l);
                                p.add(t);

                                mb.add(m1);
                                mb.add(m2);

                                m1.add(m[0]);
                                m1.add(m[1]);
                                m1.addSeparator();
                                m1.add(m[2]);

                                m2.add(m[3]);
                                m2.add(m[4]);

                                setLayout(new BorderLayout());
                                add(mb,BorderLayout.NORTH);
                                add(p,BorderLayout.CENTER);
                                setSize(300,150);
                                setVisible(true);

                                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                } 
                /*void sortasc()
                  {
                  for(int i=0;i<n;i++)
                  for(int j=0;j<n-1;j++)
                  {
                  if(arr[j]>arr[j+1])
                  {
                  int t=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=t;
                  }
                  }
                  StringBuffer s5=new StringBuffer();
                  for(int i=0;i<n;i++)
                  {
                  s5.append(new Integer(arr[i]).toString());
                  s5.append(" ");
                  }
                  t.setText(new String(s5));
                  }

                  void sortdesc()
                  {
                  for(int i=0;i<n;i++)
                  for(int j=0;j<n-1;j++)
                  {
                  if(arr[j]<arr[j+1])
                  {
                  int t=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=t;
                  }
                  }
                  StringBuffer s5=new StringBuffer();
                  for(int i=0;i<n;i++)
                  {
                  s5.append(new Integer(arr[i]).toString());
                  s5.append(" ");
                  }
                  t.setText(new String(s5));
                  }*/
                public int givesum()
                {
                                int sum=0;
                                for(int i=0;i<n;i++)
                                {
                                                sum=sum+arr[i];
                                }
                                return sum;
                }

                public double giveavg()
                {
                                int sum=0;
                                for(int i=0;i<n;i++)
                                {
                                                sum=sum+arr[i];
                                }
                                return sum/n;
                }

                public void actionPerformed(ActionEvent e)
                {
                                String s=e.getActionCommand();             //return the name of menu
                                if(s.equals("Exit"))
                                                System.exit(0);
                                else if(s.equals("Load"))
                                {
                                                if(arr[0]==0)
                                                {
                                                                int i=0;
                                                                try
                                                                {
                                                                                BufferedReader r=new BufferedReader(new FileReader("new.txt"));
                                                                                String s1=r.readLine();
                                                                                while(s1!=null)
                                                                                {
                                                                                                ss.append(s1);
                                                                                                ss.append(" ");
                                                                                                arr[i]=Integer.parseInt(s1);
                                                                                                n=++i;
                                                                                                s1=r.readLine();
                                                                                }
                                                                }
                                                                catch(Exception eee)
                                                                {       }
                                                                t.setText(new String(ss));
                                                }
                                }
                                else if(s.equals("Save"))
                                {
                                                char ch;
                                                String sss = t.getText();
                                                try
                                                {
                                                                FileOutputStream br1 = new  FileOutputStream("new.txt");
                                                                for(int i=0;i<sss.length();i++)
                                                                {
                                                                                ch=sss.charAt(i);
                                                                                if(ch == ' ')
                                                                                                br1.write('\n');
                                                                                else
                                                                                                br1.write(ch);
                                                                }
                                                                br1.close();}
                                                                catch(Exception eee)
                                                                { }
                                }
                                else if(s.equals("Sum"))
                                {
                                                t.setText(new Integer(givesum()).toString());
                                }
                                else if(s.equals("Average"))
                                {
                                                t.setText(new Double(giveavg()).toString());
                                }
                }

                public static void main(String arg[])
               
                                Slip4_1 ob = new Slip4_1();
                }
}
