import java.util.Scanner;
public class Account {
	Scanner sc=new Scanner(System.in);
    private String name;
    private int accno;
    void getdata()
    {
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter account no");
        accno=sc.nextInt();
    }
    void setdata()
    {
        System.out.println("your name is "+name);
        System.out.println("Account number is "+accno);
    }
}
