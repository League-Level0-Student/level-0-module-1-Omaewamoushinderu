//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String  Jacob = "Breaks technology by touching it"; 

String Tam = "power of cats";
		
String Reyna = "Invisibility";

		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter a name of someone at your table");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("Tam")) {
	JOptionPane.showMessageDialog(null, Tam);
	}
else if(name.equals("Reyna")) {
	JOptionPane.showMessageDialog(null , Reyna );
}
else if(name.equals("Jacob"));{
	JOptionPane.showMessageDialog(null, Jacob);
}
}
}
