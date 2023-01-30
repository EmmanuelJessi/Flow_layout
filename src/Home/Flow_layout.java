package  Home;

import javax.swing.*;
import  java.awt.*;

public class Flow_layout {

    public Flow_layout(){
        JFrame Flow_JFrame = new JFrame("Flow layout Frame");

        //creating the buttons

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");

        // creating the button to frame

        Flow_JFrame.add(b1);
        Flow_JFrame.add(b2);
        Flow_JFrame.add(b3);
        Flow_JFrame.add(b4);
        Flow_JFrame.add(b5);
        Flow_JFrame.add(b6);
        Flow_JFrame.add(b7);
        Flow_JFrame.add(b8);
        Flow_JFrame.add(b9);
        Flow_JFrame.add(b10);

        // parameter less constructor is used
        // therefore, alignment is center
        // horizontal as the vertical gap is 5 units.

        Flow_JFrame.setLayout(new FlowLayout());
        Flow_JFrame.setSize(300, 300);
        Flow_JFrame.setVisible(true);







    }

}
