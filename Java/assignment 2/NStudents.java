/*Write a java program to create n objects of the Student class. Assign roll numbers in
the ascending order. Accept name and percentage from the user for each object. Define a
static method “sortStudent” which sorts the array on the basis of percentage.
*/
import java.io.*;
class NStudents
{
 int rollno;
 String sname;
 float per;
 public void accept()
  {
   try
    {
      BuferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter student name:");
      sname=br.readLine();
      System.out.println("Enter student percentage:");
      per=Float.valueOf(br.readLine()).floatValue();
    }
   catch(Exception e){}
  }
 public static void sortStudent(NStudents s[],int n)
  {
    float.temp;
    String temp1;

    for(int i=0;i<n;i++)
     {
      for(int j=i+1;j<n;j++)
       {
        if(s[i].per > s[j].per)
         {
          temp=s[i].per;
          s[i].per=s[j].per;
          s[j].per=temp;

          temp1=s[i].sname;
          s[i].sname=s[j].sname;
          s[j].sname=temp1;
         }
       }
     }
    for(int i=0;i<n;i++)
     {
      s[i].rollno=i+1;
      System.out.println("\n"+s[i].rollno+"\t"+s[i].sname+"\t"+s[i].per);
     }
  }
public static void main(String a[])
{
 int n;
 try
  {
   BuferedReader br=new BufferedReader(new InputStreamReader(System.in));  
   System.out.println("How many objects you want to create:");
   n=Integer.parseInt(br.readLine());

   NStudent s[]=new NStudent[n];
   for(int i=0;i<n;i++)
    {
     s[i]=new NStudent();
     s[i].accept();
    }
   System.out.println("\nStudent Details:");
   System.out.println("RollNo\tName\tPercentage");
   for(int i=0;i<n;i++)
    {
     s[i].rollno=i+1;
     System.out.println("\n"+s[i].rollno+"\t"+s[i].sname+"\t"+s[i].per);
    }
   NStudent s1=new NStudents();
   System.out.println("\nStudent details in ascending order of their percentages:");
   System.out.println("Roll No\tName\tPercentage");
  
   s1.sortStudent(s,n);
  }
  catch(Exception e)
  { }
 }
}