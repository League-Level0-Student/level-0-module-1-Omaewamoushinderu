import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("I have hands I can move but I cannot clap, what am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("clock")){
JOptionPane.showMessageDialog(null, "correcto mundo");
score++;
JOptionPane.showMessageDialog(null, "congrats you scored " + score);
}		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "WROOOOOOOONG!!!");
	
}
		// 6. Add some more riddles
String riddler = JOptionPane.showInputDialog("They try to beat me, they try in vain.\n" + 
		"And when I win, I end the pain.");
if(riddler.equals("death")) {
JOptionPane.showMessageDialog(null, "correcto mundo");
score++;
	JOptionPane.showMessageDialog(null, "congrats you scored " + score);
}
else {
	JOptionPane.showMessageDialog(null, "WROOOOOOOONG!!!");
	
}
		// 2. Make a pop up to show the score.

String riddlee = JOptionPane.showInputDialog(null, "What is so delicate that saying its name breaks it?");
if(riddlee.equals("silence")) {
	JOptionPane.showMessageDialog(null, "correcto mundo");
	score++;
		JOptionPane.showMessageDialog(null, "congrats you scored " + score);
}
else {
	JOptionPane.showMessageDialog(null, "WROOOOOOOONG!!!");
	

}
}
}



