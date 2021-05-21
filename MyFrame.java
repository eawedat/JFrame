package com.eawedat;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        this.setTitle("Hello");
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon imageIcon = new ImageIcon("lion.png");
        this.setIconImage(imageIcon.getImage());

        this.getContentPane().setBackground(Color.GREEN);
        //frame.getContentPane().setBackground(new Color(0,255,0));
        //frame.getContentPane().setBackground(new Color(0xFFFFFF));
    }
}
