package exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * 创建名为Test1的类，此类继承了JFrame，实现了接口ActionListner
 */
public class Test1 extends JFrame implements ActionListener{
	
	JLabel l1=new JLabel("label1");//创建标签名为label1的标签，对象索引名为l1；
	JLabel l2=new JLabel("label2");//创建标签名为label2的标签，对象索引名为l2；
	
	JTextField t1=new JTextField(8);//创建文本框t1
	JTextField t2=new JTextField(8);//创建文本框t2
	
	JButton b=new JButton("function");//创建按钮名为function的按钮
	
	static JPanel p=new JPanel();//创建静态面板p，静态概念自己看书，，
	JPanel p1=new JPanel();//创建面板p1
	JPanel p2=new JPanel();//创建面板p2
	
	/*
	 * 创建Test1方法
	 */
	public Test1() {
		// TODO Auto-generated constructor stub
		t2.setEnabled(false);//设置t2文本框不可操作，此步可省略，，
		
		b.setActionCommand("function");//给所触发的事件命名为function
		b.addActionListener(this);//给b按钮设置触发，与下面actionPerformed的function对应
		
		p.setLayout(new BorderLayout());//给静态面板p设置布局
		
		/*
		 * 给p1面板添加组件：l1，t1，l2，t2，按顺序添加
		 */
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		
		p2.add(b);//给给p2添加组件按钮b
		
		/*
		 * 将面板p1，p2以borderlayout布局方式添加至静态面板p
		 */
		p.add(p1,BorderLayout.CENTER);
		p.add(p2,BorderLayout.SOUTH);
		
		/*
		 * 给面板p1，p2设置GridLayout布局
		 */
		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new GridLayout(1, 1));
	}
	
	/*
	 * 主函数，创建继承了JFrame，实现了接口ActionListner的名为frame对象索引
	 */
	public static void main(String[] args) {
		JFrame frame=new Test1();//创建对象索引frame
		frame.getContentPane().add(p);//给frame添加组件面板p
		frame.setTitle("Test1");//设置标题为Test1
		frame.setSize(200,150);//设置大小
		frame.setLocationRelativeTo(null);//设置frame的位置：据屏幕中央
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认操作：默然框架frame为关闭
		frame.setVisible(true);//设置frame可见
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 * 重载：实现接口时必须重载复写。。
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		/*
		 * 判断触发的事件是否为function，是：执行function（这是题的框架，所以这里function每道题不一样），否：不执行
		 */
		if (arg0.getActionCommand()=="function") {
		}
		
	}

}
