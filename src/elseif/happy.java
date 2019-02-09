package elseif;

import javax.swing.JOptionPane;

public class happy {



public static void main(String[]args) {
	
	 String are =JOptionPane.showInputDialog("Are you happy?");
	
	if(are.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	
	 if(are.equals("no")) {
		String happy = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		 if(happy.equals("yes")) {
			 JOptionPane.showMessageDialog(null,"Change something");
		 }
			 else if(happy.equals("no")) {
				 JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		 }
	 }
	 
	
	
	
	
	
	
	
	
	
}
}