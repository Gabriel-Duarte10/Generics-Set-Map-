package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;
import services.CalcStudents;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		CalcStudents<Students> set = new CalcStudents<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Name: ");
			String name = sc.next();
			set.preenche(new Students(name), 'a');
		}
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Name: ");
			String name = sc.next();
			set.preenche(new Students(name), 'b');
		}
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Name: ");
			String name = sc.next();
			set.preenche(new Students(name), 'c');
		}

		set.print();

		System.out.println("Total: " + set.cont());

		sc.close();
	}
}
