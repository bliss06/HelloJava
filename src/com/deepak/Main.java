package com.deepak;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("Hello, Java");
        frame.setSize(300, 300);
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
