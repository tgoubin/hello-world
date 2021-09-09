package org.blagnac.mpa.helloworld;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Hello World frame
 * 
 * @author Thibault GOUBIN
 */
public class HelloWorldFrame extends JFrame {

	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = -4038459599738008780L;

	/**
	 * Hello World
	 */
	public static final String HELLO_WORLD = "Hello World";

	/**
	 * Main JPanel
	 */
	private JPanel mainPanel;

	/**
	 * Hello World label
	 */
	private JLabel helloWorldLabel;

	/**
	 * Constructor
	 */
	public HelloWorldFrame() {
		// Frame settings
		setTitle(HELLO_WORLD);
		setSize(300, 100);
		setLocationRelativeTo(getParent());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Main JPanel
		mainPanel = new JPanel(new FlowLayout());
		setContentPane(mainPanel);
		helloWorldLabel = new JLabel(HELLO_WORLD);
		helloWorldLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		mainPanel.add(helloWorldLabel);
	}

	/**
	 * Displays the HelloWorld frame
	 */
	public void display() {
		setVisible(true);
	}

	public JLabel getHelloWorldLabel() {
		return helloWorldLabel;
	}
}
