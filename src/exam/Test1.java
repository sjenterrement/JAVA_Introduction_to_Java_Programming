package exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * ������ΪTest1���࣬����̳���JFrame��ʵ���˽ӿ�ActionListner
 */
public class Test1 extends JFrame implements ActionListener{
	
	JLabel l1=new JLabel("label1");//������ǩ��Ϊlabel1�ı�ǩ������������Ϊl1��
	JLabel l2=new JLabel("label2");//������ǩ��Ϊlabel2�ı�ǩ������������Ϊl2��
	
	JTextField t1=new JTextField(8);//�����ı���t1
	JTextField t2=new JTextField(8);//�����ı���t2
	
	JButton b=new JButton("function");//������ť��Ϊfunction�İ�ť
	
	static JPanel p=new JPanel();//������̬���p����̬�����Լ����飬��
	JPanel p1=new JPanel();//�������p1
	JPanel p2=new JPanel();//�������p2
	
	/*
	 * ����Test1����
	 */
	public Test1() {
		// TODO Auto-generated constructor stub
		t2.setEnabled(false);//����t2�ı��򲻿ɲ������˲���ʡ�ԣ���
		
		b.setActionCommand("function");//�����������¼�����Ϊfunction
		b.addActionListener(this);//��b��ť���ô�����������actionPerformed��function��Ӧ
		
		p.setLayout(new BorderLayout());//����̬���p���ò���
		
		/*
		 * ��p1�����������l1��t1��l2��t2����˳�����
		 */
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		
		p2.add(b);//����p2��������ťb
		
		/*
		 * �����p1��p2��borderlayout���ַ�ʽ�������̬���p
		 */
		p.add(p1,BorderLayout.CENTER);
		p.add(p2,BorderLayout.SOUTH);
		
		/*
		 * �����p1��p2����GridLayout����
		 */
		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new GridLayout(1, 1));
	}
	
	/*
	 * �������������̳���JFrame��ʵ���˽ӿ�ActionListner����Ϊframe��������
	 */
	public static void main(String[] args) {
		JFrame frame=new Test1();//������������frame
		frame.getContentPane().add(p);//��frame���������p
		frame.setTitle("Test1");//���ñ���ΪTest1
		frame.setSize(200,150);//���ô�С
		frame.setLocationRelativeTo(null);//����frame��λ�ã�����Ļ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����Ĭ�ϲ�����ĬȻ���frameΪ�ر�
		frame.setVisible(true);//����frame�ɼ�
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 * ���أ�ʵ�ֽӿ�ʱ�������ظ�д����
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		/*
		 * �жϴ������¼��Ƿ�Ϊfunction���ǣ�ִ��function��������Ŀ�ܣ���������functionÿ���ⲻһ�������񣺲�ִ��
		 */
		if (arg0.getActionCommand()=="function") {
		}
		
	}

}
