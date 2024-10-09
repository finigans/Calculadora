package Intro;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calc extends JFrame{
	
	public Calc() {
		super("calculadora");
		
		Container n = new JPanel();
		n.setLayout(new GridLayout(4,4));
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, new JTextField());
		c.add(BorderLayout.CENTER, n);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
	
		new Calc();

	}

}
