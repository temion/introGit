import java.awt.event.*;

import javax.swing.*;

public class IntroGit extends JFrame implements ActionListener {

	JButton b;

	public IntroGit() {
		setTitle("Fenêtre du swag");
		setSize(100, 100);
		setLocationRelativeTo(null);

		b = new JButton("Quitter");
		b.addActionListener(this);

		add(b);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			JOptionPane.showMessageDialog(this, "Gandalf.", "Gandalf", JOptionPane.NO_OPTION);
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new IntroGit();
	}
	
}