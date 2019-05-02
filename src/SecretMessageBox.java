import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String password = "Password";
			String message = JOptionPane.showInputDialog("Type in a secret message!");
			JOptionPane.showMessageDialog(null, "You can only see the secret message if you can guess the password!");
			String guess = JOptionPane.showInputDialog("Type in what you guess the password is!");
			if (guess.equals(password)) {
				JOptionPane.showMessageDialog(null, message);
			} else {
				JOptionPane.showInputDialog("INTRUDER!!");
			}
	
}
}
