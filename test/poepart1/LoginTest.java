/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poepart1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;

/**
 *
 * @author lab_services_student
 */
public class LoginTest 
{
    public LoginTest() {
    }
    
    public LoginTest(String userName, String passWord) 
    {
    }
    Login login = new Login("String userName", "String passWord");
    @Test
    public void testCheckUsername() 
    {
        String expected = "userName";
        Boolean actual = login.checkUsername(); 
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCheckPasswordComplexity() 
    {
        String expected = "passWord";
        Boolean actual = login.checkPasswordComplexity(); 
        
        assertEquals(expected, actual);
    }

    @Test
    public void testRegisterUser() 
    {
        String expected = "user";
        String actual = login.registerUser(); 
        
        assertEquals(expected, actual);
    }

    @Test
    public void testLoginUser() 
    {
        String expected = "user";
        Boolean actual = login.loginUser(); 
        
        assertEquals(expected, actual); 
    }

    @Test
    public void testReturnLoginStatus() 
    {
        String expected = "user";
        String actual = login.returnLoginStatus(); 
        
        assertEquals(expected, actual);
        
    } 
}
