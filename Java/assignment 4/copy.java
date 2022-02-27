/*Accept the names of two files and copy the contents of the first to the second. First file having Book name and Author name in file. Second file having the contents of First file and also add the comment ‘end of file’ at the end.

*/

import java.io.*;
import java.util.*;
class copy{
public static void main(String arg[]) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.print("source file name :\n");
String file1 = sc.next();
System.out.print("destination file name :\n");
String file2 = sc.next();
FileReader fin = new FileReader(file1);
FileWriter fout = new FileWriter(file2, true);
int c;
while ((c = fin.read()) != -1) {
fout.write(c);
}
System.out.println("Copy finish...");

fin.close();
fout.close();
}
}
