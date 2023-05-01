package thread;

class A01 extends Thread{
	public void run() { // thread에 의해 개별 동작
		for(int i=0; i<100; i++) {
			System.out.println(i + ".A01");
		}
	}
}

class B01 extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + ".BB01");
		}
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		/*
		a.run();
		b.run();
		*/
		a.setDaemon(true);
		b.setDaemon(true);
		// 나를 포함한 메소드가 종료되면 thread도 종료하겠다.
		a.start();
		// start ; run이라는 메소드를 개별적으로 동작하게 만듬
		b.start();
		System.out.println("==main 종료==");
		System.out.println("==main 종료==");
		System.out.println("==main 종료==");
		System.out.println("==main 종료==");
	}
}
