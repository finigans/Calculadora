package Intro;

import javax.swing.JFrame;

public class Calc extends JFrame{
	
	public Calc() {
		super("calculadora");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
	
		new Calc();

	}

}
