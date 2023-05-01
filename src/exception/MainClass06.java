package exception;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n1 = null, n2= null;
		
		System.out.println("===========");
		System.out.println("1.입력");
		n1=scan.nextLine();
		// 공백이 아닌 enter값을 인식함
		System.out.println("2.입력");
		n2=scan.nextLine();
		System.out.println("===========");
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		
		/*
		System.out.println("===========");
		System.out.println("1.입력");
		n1=scan.next();
		System.out.println("2.입력");
		n2=scan.next();
		System.out.println("===========");
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		*/
	}
}
