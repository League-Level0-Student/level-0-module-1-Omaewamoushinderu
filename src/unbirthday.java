import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
String  unbirthday =	JOptionPane.showInputDialog(null, "When's your birthday?");
if (unbirthday.equals("5 17")){
	JOptionPane.showMessageDialog(null, "Happy birthday!");
}
else {
	JOptionPane.showMessageDialog(null, "Happy unbirthday!");	
}
}
}
