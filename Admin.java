

/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class  Admin extends Intro
{
    public void admin()
    {
        
        String name="",name1="";
        String emailid,DOB,DOJ,address,department,grade="";
        int lossofpay;
        int nodays=30;
        String mobno;
        
        int len1,len2,len3,len4,len5;
        int a;
        int h=1;
        String n1, n2;
        int S;
        char ch1,ch2;
        double basic=0.0,DA=0.0,HRA=0.0,SPL=0.0;
        double gross=0.0,Pt=0.0;
        double rem,rem1,rem2,rem3,sum=0.0,sum1=0.0;
        String EI;
        double x=0.0,u=0.0,z=0.0;
        int d=1,t=1;
        char ch,sz,az;
        int is=1;
        double PF=0.0;
        double IT=0.0,IT1=0.0;
        double MIT;
        double annual;
        double basic1=0.0;
        Scanner AS=new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Start entering the details");
        System.out.println("Enter the  first name:");
        n1=AS.next();
        len1=n1.length();
        while(d<len1)
        {
            sz=n1.charAt(d);
            name=name+sz;
            d++;
        }
        ch1=n1.charAt(0);
        if(ch1>='a' && ch1<='z')
        {
            ch1-=32;
        }
        name=name+ch1;
        d=1;
        System.out.println("Enter your last name:");
        n2=AS.next();
        len2=n2.length();
        
        while(d<len2)
        {
            az=n2.charAt(d);
            name1=name+az;
            d++;
        }
        ch2=n1.charAt(0);
        if(ch2>='a'&& ch2<='z')
        {
            ch2-=32;
        }
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        d=1;
        int end=1;
        System.out.println("Enter the EmailID:");
        emailid=AS.next();
        
        System.out.println("Enter the Employee ID");
        EI=AS.next();
        len3=EI.length();
        
        while(d<len3)
        {
            if(len3==5)
            {
                break;
            }
            else
            {   
                System.out.println("Input the employee id again");
            }
            d++;
        }
         System.out.println("-------------------------------------------------------------------------------");
         System.out.println("-------------------------------------------------------------------------------");
              System.out.println("Enter the Address:");
               address=AS.next();
        
        char PAN[]=new char[10];
        for( S=0;S<10;S++)
        {
            System.out.printl("Enter the PAN no.");
            PAN[S]=AS.next().charAt(0);
            System.out.print(PAN[S]+"\t");
        }
        len4=PAN.length;
        for( S=0;S<10;S++)
        {
            
            
            if(len4==10)
            {
                if(PAN[0]>='A'||PAN[0]<='Z'||PAN[0]>='a'||PAN[0]<='z')
                {
                    break;
                }
                
                else 
                {
                      System.out.println("PAN no should always start with a character");
                    
                }
            }
            else
            {
                System.out.println("Incorrect PAN no input again");
                
            }
        }
              System.out.println("--------------------------------------------------------------------------------------------");
              System.out.println("--------------------------------------------------------------------------------------------");
            int Date=0,Month=0, Year=0;
            int ut=1,dt=1,at=1;
            int DD,MM,YY;
            System.out.println("Date of Birth");
              while(ut>=1)
             {
             System.out.println("Enter the date"); 
             DD=AS.nextInt();
             if(DD<=31)
             {Date=DD;
                break;}
                ut++;
            }
            while(dt>=1)
            {
             System.out.println("Enter the month");
             MM=AS.nextInt();
             if(MM<=12)
             {  Month=MM;
                 break;
                }
                dt++;
            }
            while(at>=1)
            { 
             System.out.println("Enter the Year:" );
             YY=AS.nextInt();
             if(YY>=1980&&YY<2000)
             {
                 Year=YY;
                 break;
                }
                at++;
            }
             int DD1,MM1,YY1;
             int Date1=0,Month1=0,Year1=0;
             System.out.println("Date of Joining");
             while(ut>=1)
             {
             System.out.println("Enter the date"); 
             DD1=AS.nextInt();
             if(DD1<=31)
             {Date1=DD1;
                break;}
                ut++;
            }
            while(dt>=1)
            {
             System.out.println("Enter the month");
             MM1=AS.nextInt();
             if(MM1<=12)
             {  Month1=MM1;
                 break;
                }
                dt++;
            }
            while(at>=1)
            { 
             System.out.println("Enter the Year:" );
             YY1=AS.nextInt();
             if(YY1>=2000&&YY1<=2018)
             {
                 Year1=YY1;
                 break;
                }
                at++;
            }
            
             System.out.println("Enter the mobile no:");
             mobno=AS.next();
             len5=mobno.length();
            while(d>1)
            {
           if(len5==10)
           {
           break;
           }
           else
           {
            System.out.println("Wrong mobile no input the no again");
           }
           d++;
              }
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("---------------------------------------------------------------------------------------------");
           System.out.println("Enter the Department:");
           department=AS.next();
           
           if(department.equals("Accounts")||department.equals("accounts")||department.equals("HumanResources")||department.equals("humanresources")||department.equals("Purchase")||department.equals("purchase")||
             department.equals("Production")||department.equals("production"))
        {
            
              System.out.println("Enter the Basic pay:" );
              basic =AS.nextDouble();
              if (basic>=80000.0 && basic<=100000.0)
              {
                  grade="other employees";
                  sum+=basic;
                }
                else if (basic>=100001.0 && basic<=200000.0)
                {
                    grade="Manager";
                    sum+=basic;
                }
                else if (basic>=200001.0 && basic<=400000.0)
                {
                   grade=" Assistant General Manager";
                   sum+=basic;
                }
                else if(basic>400000.0)
                {
                    grade="General Manager";
                    sum+=basic;
                }
                else 
                {
                    System.out.println(" Insufficient basic pay!! Input it again");
                    basic=AS.nextDouble();
                }
                  System.out.println("-----------------------------------------------------------------------------------------"); 
                  
                  System.out.println("Enter the dearness allowance: ");
                  DA=AS.nextDouble();
                  if (DA>=250.0 && DA<=500.0)
                  
                  {
                      grade="other employees";
                      sum=sum+DA;
                    }
                    else if(DA>500.0 && DA<=750.0)
                    {
                        grade="Manager";
                        sum=sum+DA;
                    }
                    else if(DA>750.0&&DA<=1000.0)
                    {
                        grade=" Assistant General Manager";
                        sum=sum+DA;
                    }
                    else if(DA>1000.0) 
                    {
                        grade ="General Manager";
                        sum=sum+DA;
                    }
                    else 
                    {System.out.println("Insufficient Dearness Allowance!!! input again");
                     DA=AS.nextDouble();}
                    System.out.println("-----------------------------------------------------------------------------------------"); 
                  
                     System.out.println("Enter the Housing Rent Allowance :");
                      HRA=AS.nextDouble();
                      if(HRA>=300 &&HRA<=500.0)
                      {
                          grade="Other Employees";
                          sum=sum+HRA;
                        }
                        else if (HRA>500.0&&HRA<=700.0)
                        {
                            grade="Manger";
                            sum=sum+HRA;
                        }
                        else if(HRA>700.0&&HRA<=900.0)
                        {
                            grade=" Assistant General Manager";
                            sum=sum+HRA;
                        }
                        else if (HRA>900.0)
                        {
                            grade="General Manger";
                        }
                        else
                        {System.out.println("Insufficient Housing Rent Allowance!! input again");
                         HRA=AS.nextDouble();}
                      System.out.println("-----------------------------------------------------------------------------------------"); 
                        System.out.println("Enter the special Allowance:");
                      SPL=AS.nextDouble();
                      if (SPL>=100.0&&SPL<=300.0)
                      {
                          grade="Other Employees";
                          sum+=SPL;
                        }
                        else if (SPL>=300.0&&SPL<=500.0)
                        {
                            grade="Manager";
                            sum+=SPL;
                        }
                        else if(SPL>500.0&&SPL<=700.0)
                        {
                            grade="General Manager";
                            sum+=SPL;
                        }
                        else if (SPL>750.0)
                    { grade="General Manager";
                        sum+=SPL;
                    }
                    else{
                      System.out.println("Insufficient Special Allowances !!! wrong again");
                      SPL=AS.nextDouble();}
                    System.out.println("-----------------------------------------------------------------------------------------"); 
            }
            
           else
           {
            System.out.println("No such  Department !!!!Input again");
            department=AS.next();}
            
        System.out.println("Number of leave in a month:");
        lossofpay=AS.nextInt();
        System.out.println("Data stored");
        double j;
        while(t<=2)
        {
            
            basic= basic1;
            rem=basic/30;
            x=rem*lossofpay;
             basic1=basic-x;
             sum1=sum1+basic1;
            System.out.println("Deduction in basic ="+x);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            rem1=DA/30;
            z=rem1*lossofpay;
            DA-=z;
            sum1=sum1+DA;
            System.out.println("Deduction in Dearness Allowances="+z);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            
            rem2=HRA/30;
            u=rem2*lossofpay;
            HRA-=u;
            sum1=sum1+HRA;
            System.out.println("Deduction in Housing Renting Allowances ="+u);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            rem3=SPL/30;
            j=rem3*lossofpay;
            SPL-=j;
            sum1=sum1+SPL;
            System.out.println("Deduction in Special Allowances");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            gross=sum-sum1;
            t++;
         }
        
        PF=basic*0.12;
        if(is==1)
        { 
        if(gross>0&&gross<=10000.0)
        {
            Pt=0.0;
        
        }
        else if (gross>10000.0&&gross<=15000.0)
        {
            Pt=175;
        }
        else if(gross>15000.0&&gross<=25000.0)
        {
            Pt=200;
        }
        else if (gross>25000.0&&gross<=9999999)
        {
            Pt=225;
        }
        is++;
    }
        annual=gross*12;
        if (annual>0.0&&annual<=250000.0)
        {
            IT=0;
        }
        else if(annual>250000.0&&annual<=500000)
        {
            IT=(10*annual)/100.0;
        }
        else if (annual>500000.0&&annual<1000000.0)
        {
            IT=(20*annual)/100.0;
        
        }
        else if(annual>1000000.0)
        {
            IT=(30*annual)/100.0;
        }
        
        MIT=IT/12;
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        
    
       
   
        
        int choice;
        
        double basic2=basic;
        double DA1=DA;
        double SPL1=SPL;
        double HRA1=HRA;
        
        double f=1.0;
        
        System.out.println("*******************************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSHRUSHTI ENTERPRISES!!!");
        System.out.println("Options--------->choices");
        System.out.println("Annual Salary-------->1");
        System.out.println("Monthly Salary--------->2");
        System.out.println("Enter your choice:");
        choice=AS.nextInt();
        switch(choice)
        
        {
            case 1:  basic2=basic2*12;
                     DA1=DA1*12;
                    HRA1=HRA*12;
                    SPL1=SPL*12;
                    IT1=IT;
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tANNUAL PAYROLL RECIEPT");
                    break;
            case 2 : basic2=basic*f;
                      DA1=DA*f;
                      SPL1=SPL*f;
                     HRA1=HRA*f;
                    IT1=MIT*f;
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMONTHLY PAYROLL RECIEPT");
                  break;
            default:
            while(h>2)
            {
                    System.out.println("Wrong option !! Try Again");
                    h++;
                    
                }
            break;
        }
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******************************************************");
           System.out.println("Employee Name:"+name+name1+"\t\t\t\t\t\t\t\t\t\t\t\t\tEmployeeID:"+EI);
           System.out.println("Email ID:"+emailid);
           System.out.println("Adress:"+address);
           System.out.print("Pan no:"+PAN);
           System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDOJ:"+Date1+"/"+Month1+"/"+Year1+"\t\t\t\t\t\t\t\t\t\t\t\tDOB:"+Date+"/"+Month+"/"+Year);
           Date date=new Date();
           System.out.println(date);
           System.out.println("Grade:"+grade+"\t\t\t\t\t\t\t\tDepartment:"+department);
           System.out.println(" Earning Rates\t\t\t\t\t\t\t\t\t\t\tWorking Details\t\t\t\t\t\t\t\t\t\t\t\t\tEarnings\t\t\t\t\t\t\t\t\t\t\tDeductions");
           System.out.println(" BasicPay:"+basic+"\t\t\t\t\t\t\t\t\t\tleave:"+lossofpay+"\t\t\t\t\t\t\t\t\t\tDeduction in basic due to loss of pay"+x+"\t\t\t\t\t\t\t\t\t\tProvidentfund:"+PF);
           System.out.println("Housing rent Allowance:"+HRA+"\t\t\t\t\t\\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDeduction in HRA due to loss of pay"+u+"\t\t\t\t\t\t\t\t\t\t\tProfessionalTax:"+Pt);
           System.out.println("Dearness Allowances:"+DA+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDeduction in DA due to loss of pay "+z+"\t\t\t\t\t\t\t\t\t\t\t\tIncomeTax:"+IT1);
        }
    }
    
                  
    

        
        
        
        
        
        
    

        
        
        
        
       
    
        
               
              
                
        
        
        
        
  