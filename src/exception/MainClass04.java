package exception;

class A04{
	public void a01() throws Exception {
		a02();
	}
	public void a02() throws Exception {
		a03();
	}
	public void a03() throws Exception {
		System.out.println("a03 실행");
		Thread.sleep(1000);
	}
	
	/*예외전가를 하는 메소드를 호출하는 경우 
	  호출하는 메소드 역시 예외전가를 해야 함
	  메소드 안에서 예외처리하는 경우, 호출 메소드의 예외처리 필요X
	*/
}

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		A04 a = new A04();
		a.a01();
	}
}
