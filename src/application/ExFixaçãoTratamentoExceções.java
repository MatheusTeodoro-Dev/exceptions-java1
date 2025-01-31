package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.SaqueException;

public class ExFixaçãoTratamentoExceções {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: " );
			String holder = sc.nextLine();
			System.out.print("Enter initial balance: ");
			double initBalance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Withdraw limit: ");
			double withDrawLimit = sc.nextDouble();
			sc.nextLine();
			
			Account acc1 = new Account(number, holder, initBalance, withDrawLimit);
			
			System.out.print("Enter amount for withdraw: " );
			double withDrawValue = sc.nextDouble();
			sc.nextLine();
			acc1.withDraw(withDrawValue);
			System.out.println("New balance: " + acc1.getBalance());
			} catch (SaqueException e) {
				System.out.println("Withdrawn Error: " + e.getMessage());
			}
		
		
		
		sc.close();
	}
}
