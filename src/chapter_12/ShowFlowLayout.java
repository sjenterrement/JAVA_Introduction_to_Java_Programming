package chapter_12;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowFlowLayout extends JFrame {
	
	public ShowFlowLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		//add label and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowFlowLayout frame=new ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);//center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
