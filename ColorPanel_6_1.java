package ch06;

// FileName: ColorPanel_6_1.java
// This class moves a circle 50 pixels and 
// turns it 45 degrees in response to a mouse press.

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class ColorPanel_6_1 extends JPanel
{

   private Circle circle;
	
   public ColorPanel_6_1(Color backColor, int width, int height)
   {
      setBackground(backColor);
      setPreferredSize(new Dimension(width, height));
      
      // Circle centered in the panel with radius 25
      circle = new Circle(width / 2, height / 2, 25, Color.red);
      circle.setFilled(true);
      
      // Move 50 pixels per mouse press
      circle.setVelocity(50);
      
      // Add a mouse listener to the program that is of type MoveListener
      addMouseListener(new MoveListener());
   }
	
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      circle.fill(g);      
   }

   private class MoveListener extends MouseAdapter
   {
      public void mousePressed(MouseEvent e)
      {
         circle.move();
         circle.turn(45);   // Turn 45 degrees
         repaint();
      }
   }
}