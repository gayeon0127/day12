package exception;

import java.util.Scanner;

class A02{
	public void test() {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("문제가 발생하지 않으면");
			return;
		} catch (Exception e) {
			System.out.println("문제가 발생하면");
			
		} finally {
			System.out.println("마지막에 해야하는 작업");
			// 마지막에 해야하는 작업이 있다면 finally에 추가
			scan.close();
			// 자원의 효울적 활용을 위하여 close 시점 지정
		}
		System.out.println("Next !");
		return;
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.test();
	}
}
