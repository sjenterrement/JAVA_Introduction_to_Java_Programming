package chapter_12;

import javax.swing.JFrame;

public class MyFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("MyFrame");//Create a frame
		frame.setSize(400, 300);//set the frame size
		frame.setLocationRelativeTo(null);//center a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//display the frame
	}

}
