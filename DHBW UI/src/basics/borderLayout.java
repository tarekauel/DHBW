package basics;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class borderLayout {
	
	public static void main(String[] args) {
		
		JFrame fenster = new JFrame("Border-Layout");
		
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
		
		fenster.getContentPane().setLayout(new BorderLayout());
		
		JButton knopfN = new JButton("Nie");
		JButton knopfO = new JButton("Ohne");
		JButton knopfS = new JButton("Seife");
		JButton knopfW = new JButton("Waschen");
		
		fenster.getContentPane().add(knopfN, BorderLayout.NORTH);
		fenster.getContentPane().add(knopfO, BorderLayout.EAST);
		fenster.getContentPane().add(knopfS, BorderLayout.SOUTH);
		fenster.getContentPane().add(knopfW, BorderLayout.WEST);
		
		fenster.pack();
		
	}
	
}
