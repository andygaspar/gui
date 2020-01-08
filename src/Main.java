import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(null);
        frame.setTitle("DOTS AND BOXES");
        frame.setSize(600, 400);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(backgroundPanel);


        Box.setBox(2,2,backgroundPanel);
        Box.setBox(0,0,backgroundPanel);

        Environment.setBackgroundElements(backgroundPanel);




        frame.setVisible(true);

    }
};


