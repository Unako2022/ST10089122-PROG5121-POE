/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1;

/**
 *
 * @author lab_services_student
 */
public class Login 
{
    private final String username;
    private final String password;
    
   public Login(String userName, String passWord){
        this.username = userName;
        this.password = passWord;
    }
   
    public Boolean checkUsername()
    {
        if(username.contains("_")&& (username.length()>6));
        return true;
    }     
    public Boolean checkPasswordComplexity()
    {   
        if((password.length()<= 8)&& password.contains("<A to Z>")&& password.contains("<0 to 9>")&& password.contains("<~to*>"));
        return true;    
    }     
    public String registerUser()
    {
        if(username.equals(checkUsername())&& (password.equals(checkPasswordComplexity())));
        System.out.println("The two above conditions have been met and the user has been registered successfully"); 
        if(password.equals(checkPasswordComplexity()));
        System.out.println("The username is incorrectly formatted");
        if(username.equals(checkUsername()));
        System.out.println("The password does not meet the complexity requirements"); 
        return null;
    }  
    public Boolean loginUser()
    {
        if(username.equals(username)&& (password.equals(password)));
           return true;
    }        
    public String returnLoginStatus()    
    {
        if(username.equals(username)&& (password.equals(password)))
            System.out.println("A successful login");
        else 
            System.out.println("A failed login");
        return null;
    }
}
