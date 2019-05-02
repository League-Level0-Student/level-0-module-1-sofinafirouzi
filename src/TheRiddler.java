import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0;
	String riddle1 = JOptionPane.showInputDialog("Who makes it, but has no need of it.\n" + 
			"Who buys it, but has no use for it. \n" + 
			"Who uses it but can neither see nor feel it. \n" + 
			"What is it?");
	if(riddle1.equals("a coffin")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
		
	} else {
		JOptionPane.showMessageDialog(null, "wrong");
		
	}
	String riddle2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
	if(riddle2.equals("a stamp")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
	} else {
		JOptionPane.showMessageDialog(null, "wrong");
	}
}
}
