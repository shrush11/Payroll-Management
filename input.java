
           
/**
 * Write a description of class login here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java .util.*;
public class input extends Intro
{
    public void enroll()
    {
        String password;
        int ch,lenmob,x=1;
        String mobno1="";
        int wt=1;
        int rt=1;
        int vt=1;
        String mobno;
        Scanner AS=new Scanner (System.in);
        System.out.println("User------------>choices");
        System.out.println("Admin 1---------->1");
        System.out.println("Admin 2-------->2");
        System.out.println("Enter your choice:");
        ch=AS.nextInt();
        if(ch>2)
         {
             while(rt<2)
               {
                 System.out.println("Wrong input !!!Enter your choice again ");
                 ch=AS.nextInt();
                }
            }
        System.out.println("input password:");
        password=AS.next();
        System.out.println("Enter the mobile no.");
        mobno=AS.next();
        lenmob=mobno.length();
        while (x<=1)
        {
         if(lenmob==10)
           {
           break;
           }
           else
           {
             while(wt<2)
               {System.out.println("Wrong mobile no input the no again");
                   wt++;
                }
           }
         x++;
      
        
        }
        
        mobno1=mobno1+mobno;
        if (password.equals(mobno1))
        {
            System.out.println("SUCCESFULLY LOGGED IN AS ADMIN");
            
        }
       
    
        else 
        {
            System.out.println("NOT AUTHORISED AS AN ADMIN");
            while(vt==1)
            {
            System.out.println(" Wrong password !!Enter the password again:");
            password=AS.next();
            if(password==mobno1)
            {
                break;
                
            }
           }
        }
        
}
}            
        