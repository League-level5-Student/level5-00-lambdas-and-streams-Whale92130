package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.

		addNumbers.addActionListener(e -> {
			System.out.println("1 plus 2 is " + (1 + 2));
		});
		randNumber.addActionListener(e -> {
			Random rand = new Random();
			System.out.println("This is a random number " + rand.nextInt(Integer.MAX_VALUE));
		});
		tellAJoke.addActionListener(e -> {
			System.out.println("Why was 6 afraid of 7 \nbecause 789 (seven ate 9)");
		});
		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

}
