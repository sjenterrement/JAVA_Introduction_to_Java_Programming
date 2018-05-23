package chapter_12;

import java.awt.*;

import javax.swing.*;

public class TestImageIcon extends JFrame {
	
	private ImageIcon usIcon=new ImageIcon("image/us.png");
	private ImageIcon ukIcon=new ImageIcon("image/uk.png");
	private ImageIcon canadaIcon=new ImageIcon("image/canada.png");
	private ImageIcon eireIcon=new ImageIcon("image/eire.png");
	
	public TestImageIcon() {
		setLayout(new GridLayout(1,4,5,5));
		add(new JLabel(usIcon));
		add(new JLabel(ukIcon));
		add(new JLabel(canadaIcon));
		add(new JLabel(eireIcon));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestImageIcon frame=new TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
