/*Write a java program to accept Employee name from the user and check whether it is
valid or not. If it is not valid then throw user defined Exception “Name is Invalid”
otherwise display it.(Name should contain only characters
*/

import java.lang.Exception;
class MyException extends Exception
{
                MyException(String message)
                {
                                super(message);
                }
}
class Slipno11
{
                public static void main(String args[])
                {
                                String myName;
                                System.out.println(validateFirstName("Aparna"));
                                System.out.println(validateMiddleName("123"));
                                System.out.println(validateLastName("Lohakare"));
                               
                }
                public static boolean validateFirstName(String firstname)
                {
                                return firstname.matches("[A-Z][a-z]*");
                }
                public static boolean validateMiddleName(String middlename)
                {
                                return middlename.matches("[A-Z][a-z]*");
                }
                public static boolean validateLastName(String lastname)
                {
                                return lastname.matches("[A-Z][a-z]*");
                }
}