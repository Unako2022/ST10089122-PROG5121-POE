/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poepart1;

import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;
/**
 *
 * @author lab_services_student
 */
public class ST10089122_POEpart1Test {
    
    public ST10089122_POEpart1Test() {
    }

    @Test
    public void testMain() 
    {
        String user, pass, firstName, lastName;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        firstName = input.nextLine();
        System.out.print("Enter last name: ");
        lastName = input.nextLine();
        System.out.print("Enter username: ");
        user = input.nextLine();
        System.out.print("Enter password: ");
        pass = input.nextLine();
        
        if(user.contains("_")&& (user.length()>6))
        {
            System.out.println("Username successfully captured"); 
        }
        else 
        {
            System.out.println("Username is not correctly formatted please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        assertEquals(user, user.contains("_")&& (user.length()>6));
        
        if((pass.length()<= 8)&& pass.contains("<A to Z>")&& pass.contains("<0 to 9>")&& pass.contains("<~to*>"))
        {
            System.out.println("Password successfully captured"); 
        }
        else
        {
            System.out.println("Password is not correctly formatted please ensure that your password is at least 8 characters long, contains a capital letter, a number and a special character"); 
        }
        assertEquals(pass, (pass.length()<= 8)&& pass.contains("<A to Z>")&& pass.contains("<0 to 9>")&& pass.contains("<~to*>"));
         
        if(user.equals(user)&& (pass.equals(pass)))
        System.out.println("Log in");
        
        System.out.println("Enter username: ");
        user = input.nextLine();
        assertEquals(user, user);
        System.out.println("Enter password: ");
        pass = input.nextLine(); 
        assertEquals(pass, pass);
       
        if(user.equals(user)&& (pass.equals(pass)))
  
           System.out.println("Welcome " + firstName + lastName + " it is great to see you again");
        else 
           System.out.println("Username or password incorrect, please try again"); 
    }
}    
