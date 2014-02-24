package basics;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class HausaufgabeI {

	public HausaufgabeI() {
	
	}
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Logon");
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setLayout(new BorderLayout());
		JPanel inner = new JPanel(new FlowLayout());
		inner.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		window.add(inner, BorderLayout.CENTER);
		
		JPanel left = new JPanel(new GridLayout(5,2));
		inner.add(left);
		
		left.add(new JLabel("User: "));
		left.add(new JTextField());
		
		left.add(new JLabel("Password: "));
		left.add(new JTextField());
		
		left.add(new JLabel("Art: "));
		left.add(new JComboBox<String>(new String[] { "FTP", "SSH", "HTTP", "HTTPS" } ));
		
		left.add(new JLabel("Host: "));
		left.add(new JTextField());
		
		left.add(new JLabel("Port: "));
		left.add(new JTextField());
		
		left.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Verbindungen"));
		
		JPanel right = new JPanel(new GridLayout(2,2));
		inner.add(right);
		right.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Dateien"));
		right.add(new JLabel("Ouput: "));
		right.add(new JTextField());
		
		right.add(new JLabel("Ziel: "));
		right.add(new JTextField());
		
		JPanel bottom = new JPanel(new FlowLayout());
		window.add(bottom, BorderLayout.SOUTH);
		
		bottom.add(new JButton("OK"));
		bottom.add(new JButton("CANCEL"));
		

		
		window.pack();
		
	}

}
