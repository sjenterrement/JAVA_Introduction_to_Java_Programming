package exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Texbox extends JFrame implements ActionListener{
	//创建两个固定文本
	JLabel lebel1=new JLabel("Source");
	JLabel lebel2=new JLabel("copy");
	JLabel lebel3=new JLabel("dfghj");
	
	//创建两个文本框
	JTextField text1=new JTextField(8);
	JTextField text2=new JTextField(8);
	JTextField text3=new JTextField(8);
	
	//创建一个按钮
	JButton button1=new JButton("copy");
	JButton button2=new JButton("copy");
	
	static //创建三个容器
	JPanel panel=new JPanel();
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	

	public Texbox() {
		// TODO Auto-generated constructor stub
		//text2文本框不可操作
		text2.setEnabled(false);
		
		//button触发的事件，分别于下面
		button1.setActionCommand("copy");
		button1.addActionListener(this);
		
		//使用gridlayout布局
		panel.setLayout(new BorderLayout());
		
		panel1.add(lebel1);
		panel1.add(text1);
		panel1.add(lebel2);
		panel1.add(text2);
		panel1.add(lebel3);
		panel1.add(text3);
		panel2.add(button1);
		panel2.add(button2);
		panel.add(panel1,BorderLayout.CENTER);
		panel.add(panel2,BorderLayout.SOUTH);
		
		panel1.setLayout(new GridLayout(3,2));
		panel2.setLayout(new GridLayout(1,2));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new Texbox();
		frame.getContentPane().add(panel);
		frame.setTitle("texbox");
		frame.setSize(200,150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="copy") {
			//如果触发的事件为copy，就把t1的文本给t2
			text2.setText(text1.getText());
			text1.setText(null);
		}
		
	}

}
