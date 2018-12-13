package ch06;

// FileName: ColorPanel_6_2.java
// This class moves a circle 50 pixels and 
// turns it 45 degrees in response to timer events

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class ColorPanel_6_2 extends JPanel
{
	private static final long serialVersionUID = 1L;

	private Circle circle;
	private javax.swing.Timer timer;

	public ColorPanel_6_2(Color backColor, int width, int height)
	{
		setBackground(backColor);
		setPreferredSize(new Dimension(width, height));
		
		// Circle centered in the panel with radius 25
		circle = new Circle(width / 2, height / 2, 25, Color.red);
		circle.setFilled(true);
		
		// Move 50 pixels per timer event
		circle.setVelocity(50);
		
		// Fire timer events every 1/8 second
		timer = new javax.swing.Timer(125, new MoveListener());  // 125 milliseconds = 1/8 second
		
		// Start the timer
		timer.start();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		circle.fill(g);      
	}

	private class MoveListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			circle.move();
			circle.turn(45);   // Turn 45 degrees
			repaint();
		}
	}
}