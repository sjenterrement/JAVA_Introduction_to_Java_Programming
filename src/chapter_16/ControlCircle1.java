package chapter_16;

import java.awt.*;

import javax.swing.*;

public class ControlCircle1 extends JFrame {

	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();

	public ControlCircle1() {
		JPanel panel = new JPanel();// use the panel to group buttons
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);

		this.add(canvas, BorderLayout.CENTER);// add canvas to canser
		this.add(panel, BorderLayout.SOUTH);// add buttons to the frame

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new ControlCircle1();
		frame.setTitle("ControlCircle1");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}

class CirclePanel extends JPanel {
	private int radius = 5;// default circle radius

	// repaint the circle
	protected void printComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
	}
}
