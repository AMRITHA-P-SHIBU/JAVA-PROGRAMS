package lab24;
import java.util.Scanner;
class InvalidAmountException extends Exception {
    private String msg;
    InvalidAmountException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}
class InsufficientAmountException extends Exception {
    private String msg;
    InsufficientAmountException(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }
}
class MyBank{
	public int accno,balance,wd_amnt;
	int depo_amnt;
	String name,type;
	public void OpenAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no: ");
		accno=sc.nextInt();
		System.out.println("Enter account type: ");
		sc.nextLine();
		type=sc.nextLine();
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter intial balance: ");
		balance=sc.nextInt();
		System.out.println("Account Created Succesfully!");
	}
	public void DisplayAccount() {
		System.out.println("Name: "+name);
		System.out.println("Account No: "+accno);
		System.out.println("Account Type: "+type);
		System.out.println("Initial Balance: "+balance);
	}
	public void SearchAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no.you want to search: ");
		int serchacc=sc.nextInt();
		if(serchacc==accno) {
			System.out.println("Name Of Account Holder: "+name);
			System.out.println("Account No.: "+accno);
			System.out.println("Account Type: "+type);
			System.out.println("Balance: "+balance);
		}
		else{
			System.out.println("invlaid Account No.");
		}
	}
	public void DepositAmount() {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter amount to deposit: ");
		depo_amnt=sc.nextInt();
		if(depo_amnt<=0) {
			throw new InvalidAmountException("Invalid amount; must be greater than 0.");
		}
		else {
		balance=balance+depo_amnt;
		System.out.println("Deposit successful! New balance: "+balance);
		}
		}catch(InvalidAmountException e){
			System.out.println(e.getMessage());
		}
	}
	public void WithdrawAmount() {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter amount to withdraw: ");
		wd_amnt=sc.nextInt();
		if(wd_amnt<=0){
			throw new InsufficientAmountException("Invalid amount; must be greater than 0.");
		}
		else if(wd_amnt>balance) {
			throw new InsufficientAmountException("Insufficient balance for withdrawal.\r\n");
		}
		else {
			balance=balance-wd_amnt;
			System.out.println("Withdrawal successful! New balance: "+balance);
		}
		}catch(InsufficientAmountException e){
			System.out.println(e.getMessage());
		}
	}
}
public class CustomExceptionDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice;
		int option;
		MyBank b=new MyBank();
		do {
		System.out.println("*** Banking System Application ***"
				+ "\n1.Open New Account\n2.Display Account Deatils"
				+ "\n3.Deposit Amount\n4.Withdraw Amount\n5.Search Account\n6.Exit\n"	);
		System.out.println("Enter your choice: ");
		option=sc.nextInt();
		switch(option) {
		case 1:
			b.OpenAccount();
			break;
		case 2:
			b.DisplayAccount();
			break;
			case 3:
				b.DepositAmount();
				break;
			case 4:
				b.WithdrawAmount();
				break;
			case 5:
				b.SearchAccount();
				break;
			case 6:
				System.out.println("Thank you for using the banking system. See you soon!\r\n"
						+ "\n"
						+ "\n"
						+ "*********************************\n"
						+ "    Thank You :) Visit again\n"
						+ "*********************************");
				return;
			default:
				System.out.print("Invlaid choice");
				break;
		}
		System.out.println("Do you want to continue?(y/n)");
        sc.nextLine();
        choice=sc.nextLine();
        }while(choice.toLowerCase().equals("y"));
        if(choice.toLowerCase().equals("n")) {
        System.out.println("Exiting...");
        }
	}
}