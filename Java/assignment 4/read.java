/*Write a program to read a text file “sample.txt” and display the contents of a file in
reverse order and also original contents change the case (display in upper case).
*/

import java.io.*;
import java.util.*;
class read
{
public static void main(String args[]) throws IOException
{
FileReader f = new FileReader("sample.txt");
Scanner sc = new Scanner(f);
String CH,CH2;
while(sc.hasNext())
{
StringBuilder CH1 = new StringBuilder();
CH = sc.next();
CH2=CH.toUpperCase();
CH1.append(CH2);
CH1.reverse();
System.out.println(CH1);
}
f.close();
}
}
