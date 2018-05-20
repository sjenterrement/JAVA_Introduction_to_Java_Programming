package chapter_12;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestPanels extends JFrame {
	
	public TestPanels() {
		//create panel p1 for the buttons and set GridLayout
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,3));
		
		//add buttons to the panel
		for(int i=1;i<=9;i++) {
			p1.add(new JButton(""+i));
		}
		
		p1.add(new JButton(""+0));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));
		
		//create panel p2 to hold a text field and p1
		JPanel p2=new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here"),BorderLayout.NORTH);
		p2.add(p1,BorderLayout.CENTER);
		
		//add contents into the frame
		add(p2,BorderLayout.EAST);
		add(new JButton("Food to be placed here"),BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPanels frame=new TestPanels();
		frame.setTitle("The front View of a Microwave Open");
		frame.setSize(400,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
