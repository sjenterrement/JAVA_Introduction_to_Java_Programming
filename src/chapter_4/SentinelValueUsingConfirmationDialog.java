package chapter_4;
import javax.swing.JOptionPane;
public class SentinelValueUsingConfirmationDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		//keep reading data until the user answer
		int option=JOptionPane.YES_OPTION;
		while(option==JOptionPane.YES_OPTION) {
			//READ THE NEXT DATA
			String dataString=JOptionPane.showInputDialog("Enter an int value: ");
			int data=Integer.parseInt(dataString);
			
			sum+=data;
			
			option=JOptionPane.showConfirmDialog(null, "Continue?");
		}
		JOptionPane.showMessageDialog(null, "The sum is "+sum);
		
	}
  
}
