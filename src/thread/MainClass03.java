package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("label example");
		
		Container con = frame.getContentPane();
		// 장판
		
		JLabel label = new JLabel("안녕하세요");
		// 글자 설정
		
		label.setText("aaaaA");
		// 글자 변경
		
		Font font = new Font(null,Font.ITALIC,32);
		label.setFont(font);
		// 해당 메소드에 new 생성자를 이용해서 설정 가능
		// 폰트 설정
		con.add(label);
		// 글자를 얹어줌
		
		frame.setLocation(1000,200);
		// 실행 위치 설정
		
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		// Dimension 이라는 클래스를 통해 사이즈 설정
		
		frame.setVisible(true);
		// 창을 보이게 해줌
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 종료시 같이 종료
		
		for(int i=0; ;i++) {
			label.setText(i+".변경");
		}
	}
}
