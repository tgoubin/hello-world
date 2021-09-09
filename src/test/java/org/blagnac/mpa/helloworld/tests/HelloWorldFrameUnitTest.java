package org.blagnac.mpa.helloworld.tests;

import javax.swing.JFrame;

import org.blagnac.mpa.helloworld.HelloWorldFrame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Class for HelloWorldFrame unit tests
 * 
 * @author Thibault GOUBIN
 */
public class HelloWorldFrameUnitTest {

	/**
	 * Unit test for HelloWorldFrame constructor
	 */
	@Test
	public void constructor_OK() {
		// I create a HelloWorldFrame
		HelloWorldFrame helloWorldFrame = new HelloWorldFrame();

		// I check that the frame title is "Hello World"
		Assertions.assertEquals(HelloWorldFrame.HELLO_WORLD, helloWorldFrame.getTitle());

		// I check that the frame default close operation is "Exit on close"
		Assertions.assertTrue(helloWorldFrame.getDefaultCloseOperation() == JFrame.EXIT_ON_CLOSE);

		// I check that the label displayed is "Hello World"
		Assertions.assertEquals(HelloWorldFrame.HELLO_WORLD, helloWorldFrame.getHelloWorldLabel().getText());
	}
}
