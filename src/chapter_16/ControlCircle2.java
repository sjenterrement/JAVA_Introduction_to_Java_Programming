package chapter_16;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ControlCircle2 extends JFrame {

	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();

	public ControlCircle2() {
		JPanel panel = new JPanel();// use the panel to group buttons
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);

		this.add(canvas, BorderLayout.CENTER);// add canvas to canser
		this.add(panel, BorderLayout.SOUTH);// add buttons to the frame

		jbtEnlarge.addActionListener(new EnlargeListener());

	}

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new ControlCircle2();
		frame.setTitle("ControlCircle2");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	class EnlargeListener implements ActionListener {// Inner class
		public void actionPerformed(ActionEvent e) {
			canvas.enlarge();
		}
	}

	class CirclePanel extends JPanel {// inner class
		private int radius = 5;// default circle radius

		// enlarge the circle
		public void enlarge() {
			radius++;
			repaint();
		}

		// repaint the circle
		protected void painComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
		}
	}
}
