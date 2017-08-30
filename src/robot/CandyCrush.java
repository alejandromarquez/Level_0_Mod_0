package string_manip;

import javax.swing.JOptionPane;

public class CandyCrush {

    public static void main(String[] args) {
        // 1. Using a pop-up, ask the user who they don't like
    	String name=JOptionPane.showInputDialog("Who do you not like");

        // 2. Change the next line so that the pop-up will tell them they have a crush on that person
        JOptionPane.showMessageDialog(null, "You totally have a crush on "+ name);
		//the user for the name of their best friend
      String robot=JOptionPane.showInputDialog(null, "who's your best friend");

        // 4. Tell t
        // 3. Ask hem their best friend is as sweet as candy
       JOptionPane.showMessageDialog(null,robot+ " is as sweet as candy");
       

    } 
}