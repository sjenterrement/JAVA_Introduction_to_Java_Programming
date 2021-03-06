package chapter_12;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout extends JFrame {
	
	public ShowBorderLayout() {
		//set BorderLayout with horizontal gap 5 and vertical gap 10
		setLayout(new BorderLayout(5,10));
		
		//add buttons to the frame
		add(new JButton("East"),BorderLayout.EAST);
		add(new JButton("South"),BorderLayout.SOUTH);
		add(new JButton("West"),BorderLayout.WEST);
		add(new JButton("North"),BorderLayout.NORTH);
		add(new JButton("Center"),BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowBorderLayout frame=new ShowBorderLayout();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
