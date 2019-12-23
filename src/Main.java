import javax.swing.*;
import java.awt.*;


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


        HorizontalFull[][] hf= new HorizontalFull[6][5];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                hf[i][j] = new HorizontalFull();
                hf[i][j].setButtonProperties(50 * j + 155, 50 * i + 50, 50, 50);
            }
        }


        VerticalFull[][] vf = new VerticalFull[5][6];
        //SetGrid.setGrid(vf,5,6,50,50,130,75,50);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                vf[i][j] = new VerticalFull();
                vf[i][j].setButtonProperties(50 * j + 130, 50 * i + 75, 50, 50);
            }
        }

        backgroundPanel.add(hf[1][1].getLine());
        backgroundPanel.add(hf[2][1].getLine());
        backgroundPanel.add(vf[1][1].getLine());
        backgroundPanel.add(vf[1][2].getLine());

        Box box = new Box();
        box.setButtonProperties(180, 100, 100, 100);
        backgroundPanel.add(box.getLine());


        Dot[][] dots = new Dot[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                dots[i][j] = new Dot();
                dots[i][j].setButtonProperties(50 * j + 130, 50 * i + 50, 50, 50);
                backgroundPanel.add(dots[i][j].getLine());
            }
        }




        HorizontalEmpty[][] he = new HorizontalEmpty[6][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                he[i][j] = new HorizontalEmpty();
                he[i][j].setButtonProperties(50 * j + 155, 50 * i + 50, 50, 50);
                backgroundPanel.add(he[i][j].getLine());
            }
        }



        VerticalEmpty[][] ve = new VerticalEmpty[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                ve[i][j] = new VerticalEmpty();
                ve[i][j].setButtonProperties(50 * j + 130, 50 * i + 75, 50, 50);
                backgroundPanel.add(ve[i][j].getLine());
            }
        }


        frame.setVisible(true);


    }
};



