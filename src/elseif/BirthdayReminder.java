
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	 String birthday = 
			 JOptionPane.showInputDialog("Which birthday do you want?");
	      if(birthday.equals("mom")){
	    	  JOptionPane.showMessageDialog(null,"Her birthday is " + momsBirthday);
	      }
	      else if(birthday.equals("dad")) {
	    	  JOptionPane.showMessageDialog(null, "His birthday is " + dadsBirthday);
	      }
	      else if(birthday.equals("Your birthday")) {
	    	  JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday);
	      }
	      else {
	    	  JOptionPane.showMessageDialog(null, "Sorry I don't remember that persons birthday");
	      }
		// 3. Prt what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
