package ch06;

// FileName: GUIWindow_6_3.java
// A filled circle moves back and forth across the panel,
// appearing to bounce off its edges

// This driver file uses the following files:
// Circle.java
// ColorPanel_6_3.java

import javax.swing.*;
import java.awt.*;

public class GUIWindow_6_3
{
   public static void main(String[] args)
   {
      JFrame theGUI = new JFrame();
      theGUI.setTitle("GUI Program");
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ColorPanel_6_3 panel = new ColorPanel_6_3(Color.white, 800, 400);
      Container pane = theGUI.getContentPane();
      pane.add(panel);
      theGUI.pack();
      theGUI.setVisible(true);
   }
}