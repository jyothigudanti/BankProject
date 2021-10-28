import java.util.Scanner;
public class Banking {
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        CurrentAccount cr=new CurrentAccount();
        cr.getdata();
        cr.setdata();
        SavingsAccount sr=new SavingsAccount();
        int ch;
        System.out.println("Enter 1 for current acc details");
        System.out.println("Enter 2 for saving acc details");
        System.out.println("enter ur choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                    int choice;
                    System.out.println("1.deposit");
                    System.out.println("2.Withdraw");
                    
                    System.out.println("enter the choice");
                    choice=sc.nextInt();
                    switch(choice)
                    {
                        case 1:
                                cr.depositMethod1();
                                break;
                        case 2:
                                cr.withdraw();
                                break;
                        default:
                                System.out.println("wrong choice");
                                break;
                    }
                break;
            case 2:
                    int choice1;
                    System.out.println("1.deposit");
                    System.out.println("2.withdraw");
                    System.out.println("enter the choice");
                    choice1=sc.nextInt();
                    switch(choice1)
                    {
                        case 1:
                        	sr.depositMethod2();
                                break;
                        case 2:
                                sr.withdraw1();
                                break;
                        default:
                                System.out.println("wrong choice");
                                break;
                    }
 
                break;
            default:
                System.out.println("u entered wrong choice");
        }
        
        sc.close();
    }
	

}
