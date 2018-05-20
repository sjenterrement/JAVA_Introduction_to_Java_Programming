package chapter_12;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame {
	
	public ShowGridLayout() {
		//set gridLout,3 rows, 2 columns,and gaps 5 between
		//compoments horizontally and vertically
		setLayout(new GridLayout(3,2,5,5));
		
		//add labels and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowGridLayout frame=new ShowGridLayout();
		frame.setTitle("ShowGridLayout");
		frame.setSize(200,125);
		frame.setLocationRelativeTo(null);//center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
