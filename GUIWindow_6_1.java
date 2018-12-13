package ch06;

// FileName: GUIWindow_6_1.java
// This class moves a circle 50 pixels and 
// turns it 45 degrees in response to a mouse press.

// This driver file uses the following files:
//		Circle.java
//		ColorPanel_6_1.java

import javax.swing.*;
import java.awt.*;

public class GUIWindow_6_1
{

   public static void main(String[] args)
   {
      JFrame theGUI = new JFrame();
      theGUI.setTitle("GUI Program");
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ColorPanel_6_1 panel = new ColorPanel_6_1(Color.white, 500, 500);
      Container pane = theGUI.getContentPane();
      pane.add(panel);
      theGUI.pack();
      theGUI.setVisible(true);
   }
}