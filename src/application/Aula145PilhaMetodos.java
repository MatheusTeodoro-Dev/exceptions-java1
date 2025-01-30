package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula145PilhaMetodos {

	public static void main(String[] args) {
		
		method1();
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("Method1 Start");
		method2();
		System.out.println("Method1 End");
	}
	public static void method2() {
		System.out.println("MeTHOD2 START");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}

		System.out.println("METHOD2 END");

		sc.close();
	}
}
