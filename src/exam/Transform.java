package exam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transform extends JFrame implements ActionListener {

	JLabel label1=new JLabel("Source");
	JLabel label2=new JLabel("Trans");
	
	JTextField text1=new JTextField(8);
	JTextField text2=new JTextField(8);
	
	JButton button1=new JButton("Transform");
	 static JPanel panel=new JPanel();
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	
	public Transform() {
		text2.setEnabled(false);
		button1.setActionCommand("Transform");
		button1.addActionListener(this);
		
		panel.setLayout(new BorderLayout());
		
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel2.add(button1);
		
		panel.add(panel1,BorderLayout.CENTER);
		panel.add(panel2,BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand()=="Transform") {
			String b=text1.getText().toLowerCase();
			text2.setText(b);
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new Transform();
		frame.getContentPane().add(panel);
		
		frame.setTitle("Textbox");
		frame.setSize(300,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
