
public class CurrentAccount extends Account{
	int balance;
    void depositMethod1()
    {
        
        	int deposit;
            System.out.println("enter deposit");
            deposit=sc.nextInt();
            balance=balance+deposit;
            System.out.println("Your balance amount is"+balance);
            balance=sc.nextInt();
            
            
    }
    void withdraw()
    {
        int withdraw_amt;
        System.out.println("enter withdraw_amt");
        withdraw_amt=sc.nextInt();
        balance=balance-withdraw_amt;
        if(withdraw_amt>balance)
        {
            balance=balance+withdraw_amt;
            System.out.println("You can withdraw");
        }
        else
        {
            System.out.println("you cannot withdraw");
        }
    }
}
