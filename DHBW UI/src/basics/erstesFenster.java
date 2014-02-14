package basics;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class erstesFenster {
	
	public static void main(String[] args) {
		
		JFrame rahmen = new JFrame();
		JButton knopf = new JButton("Mein Button");
		JLabel text = new JLabel("Du bist doof");
		
		rahmen.getContentPane().setLayout(new FlowLayout());
		
		rahmen.setVisible(true);
		rahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rahmen.add(knopf);
		rahmen.add(text);	
		
		rahmen.pack();
		
	}

}
