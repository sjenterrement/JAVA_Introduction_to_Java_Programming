package exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame implements ActionListener{
	
	JLabel l1=new JLabel("label1");
	JLabel l2=new JLabel("label2");
	
	JTextField t1=new JTextField(8);
	JTextField t2=new JTextField(8);
	
	JButton b=new JButton("function");
	
	static JPanel p=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	
	public Test1() {
		// TODO Auto-generated constructor stub
		l2.setEnabled(false);
		
		b.setActionCommand("function");
		b.addActionListener(this);
		
		p.setLayout(new BorderLayout());
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		
		p2.add(b);
		
		p.add(p1,BorderLayout.CENTER);
		p.add(p2,BorderLayout.SOUTH);
		
		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new GridLayout(1, 1));
	}
	
	public static void main(String[] args) {
		JFrame frame=new Test1();
		frame.getContentPane().add(p);
		frame.setTitle("Test1");
		frame.setSize(200,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand()=="function") {
		}
		
	}

}
