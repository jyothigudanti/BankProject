public class SavingsAccount extends Account {
   int savings;	
 void depositMethod2()
    {
        int deposit_amt;
        
        System.out.println("enter deposit amt");
        deposit_amt=sc.nextInt();
        savings=savings+deposit_amt;
        System.out.println("remaining balance"+savings);
        savings=sc.nextInt();
        
    }
    void withdraw1()
    {
        int withdraw_amt1;
        System.out.println("enter withdraw_amt");
        withdraw_amt1=sc.nextInt();
        
        savings=savings-withdraw_amt1;
        if(withdraw_amt1>savings)
        {
            savings=savings+withdraw_amt1;
            System.out.println("your remaining balance"+savings);
            savings=sc.nextInt();
        }
        else
        {
            System.out.println("you cannot withdraw");
        }
    }
}
