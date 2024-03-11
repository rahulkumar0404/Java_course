package Arrays;
import java.util.Scanner;
public class WithdrawMoney {
	
	class Account {
		public int bal;
		
		public Account(int bal) {
			this.bal = bal;
		}
		
		public boolean isSuffecientBalance(int w) {
			if(bal >= w) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public void withdraw(int amt) {
			bal = bal - amt;
			System.out.println("Withdraw amount is "+ amt);
			System.out.println("Your current balance is " + bal);
		}
	}
	
	class Customer implements Runnable{
		private Account account;
		public String name;
		
		public Customer(Account account, String name) {
			this.account = account;
			this.name = name;
		}
		
		public void run () {
			synchronized(account) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Hello " + name + " Please the Enter amount to withdraw");
				int amt = sc.nextInt();
				
				if(account.isSuffecientBalance(amt)) {
					account.withdraw(amt);
				}
				else {
					System.out.println("Sorry You don't have Sufficient Balance to Withdraw");
				}
			}
		}
	}
	
}

class ThreadExample{
	public static void main(String []args) {
		WithdrawMoney obj = new WithdrawMoney();
		WithdrawMoney.Account a1 = obj.new Account(1000);
		WithdrawMoney.Customer c1 = obj.new Customer(a1,"Raj"), c2 = obj.new Customer(a1, "Simran");
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
	}
}
