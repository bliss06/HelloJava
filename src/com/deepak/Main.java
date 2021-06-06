package com.deepak;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("Hello, Java");
        frame.setSize(300, 300);
        frame.add(new HelloComponent());
        frame.setVisible(true);
    }
}
