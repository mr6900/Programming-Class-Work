package com.company;
import javax.swing.*;
import java.awt.Graphics;

/**
 * Created by mr6900 on 2/4/2019.
 */
public class StartScreen extends JFrame {
    JPanel panel = new JPanel();
    JButton startButton = new JButton();

    public StartScreen(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        isVisible();
        isResizable();
        setSize(400, 400);

        add(panel);
        startButton.setText("Start");
        panel.add(startButton);
    }
}
