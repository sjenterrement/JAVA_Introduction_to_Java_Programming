package chapter_12;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TestSwingCommonFeatures extends JFrame {

	public TestSwingCommonFeatures() {
		// Create a panel to group three buttons
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		JButton jbtLeft = new JButton("Left");
		JButton jbtCenter = new JButton("Center");
		JButton jbtRight = new JButton("Right");
		jbtLeft.setBackground(Color.WHITE);
		jbtCenter.setForeground(Color.GREEN);
		jbtRight.setToolTipText("This is the Right button");
		p1.add(jbtLeft);
		p1.add(jbtCenter);
		p1.add(jbtRight);
		p1.setBorder(new TitledBorder("Three Buttons"));

		// create a font and line border
		Font largeFont = new Font("TimeRoman", Font.BOLD, 20);
		Border lineBorder = new LineBorder(Color.BLACK, 2);

		// create a panel to group two Labels
		JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
		JLabel jlbRed = new JLabel("red");
		JLabel jlbOrange = new JLabel("Orange");
		jlbRed.setForeground(Color.RED);
		jlbOrange.setForeground(Color.ORANGE);
		jlbRed.setFont(largeFont);
		jlbOrange.setFont(largeFont);
		jlbRed.setBorder(lineBorder);
		jlbOrange.setBorder(lineBorder);
		p2.add(jlbRed);
		p2.add(jlbOrange);
		p2.setBorder(new TitledBorder("Two Labels"));

		// add two panels to the frame
		setLayout(new GridLayout(2, 1, 5, 5));
		add(p1);
		add(p2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a frame and set its properties
		JFrame frame = new TestSwingCommonFeatures();
		frame.setTitle("TestSwingCommonFeatures");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
