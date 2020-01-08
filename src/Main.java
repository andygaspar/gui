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






        ObjSpecifics boxSpec= new ObjSpecifics("grafix/box.png","",40, 40, 40);
        GraphicObj box = new GraphicObj(boxSpec,false);
        box.setButtonProperties(180, 100, 100, 100);
        backgroundPanel.add(box.getLine());


        Environment.setBackgroundElements(backgroundPanel);




        frame.setVisible(true);

    }
};


/*

class Action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Mani");
    }
}


*/