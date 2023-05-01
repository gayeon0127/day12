package exception;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = 0;
		System.out.println("나이 입력");
		try {
			age = scan.nextInt();
			if (age<1) {
				throw new Exception("잘 못 입 력");
			}
			System.out.println(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Next");		
	}
}	
