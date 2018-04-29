package chapter_8;

import javax.swing.*;

public class GUIComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a button with text OK
		JButton jbtOK = new JButton("OK");

		// create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");

		// create a label with text "Enter your name: "
		JLabel jtblName = new JLabel("Eneter to your name: ");

		// create a text field with text"Type Name Here: "
		JTextField jtfName = new JTextField("Type Name Here");

		// create a check box with text bold
		JCheckBox jchkBold = new JCheckBox("Bold");

		// create a check box with text Italic
		JCheckBox jchkItalic = new JCheckBox("Italic");

		// create a radio button with text red
		JRadioButton jrbRed = new JRadioButton("Red");

		// create a radio button with text yellow
		JRadioButton jrbYellow = new JRadioButton("Yellow");

		// create a combo box with several choices
		JComboBox jcboColor = new JComboBox(new String[] { "Freshman", "Sophomore", "Junior", "Senior" });

		// create a panel to group components
		JPanel panel = new JPanel();
		panel.add(jbtOK);// add the OK to the panel
		panel.add(jbtCancel);
		panel.add(jtblName);
		panel.add(jtfName);
		panel.add(jchkBold);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);

		JFrame frame = new JFrame();// create a frame
		frame.add(panel);
		frame.setTitle("Show GUI components");
		frame.setSize(450, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}