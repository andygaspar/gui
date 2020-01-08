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

        ObjSpecifics hFullSpec= new ObjSpecifics("grafix/line_full.png",50, 20, 50);
        GridSpecifics hfGridSpec=new GridSpecifics(6,5,50, 50, 155, 50 , 50);
        GraphicObj[][] horizontalFull=new GraphicObj[hfGridSpec.rows][hfGridSpec.cols];
        SetGrid.setGrid(horizontalFull,hFullSpec,hfGridSpec,backgroundPanel,false);



        ObjSpecifics vFullSpec= new ObjSpecifics("grafix/line_full_vertical.png",20, 50, 50);
        GridSpecifics vfGridSpec=new GridSpecifics(5,6,50, 50, 130, 75 , 50);
        GraphicObj[][] verticalFull=new GraphicObj[vfGridSpec.rows][vfGridSpec.cols];
        SetGrid.setGrid(verticalFull,vFullSpec,vfGridSpec,backgroundPanel,false);






        backgroundPanel.add(horizontalFull[1][1].getLine());
        //horizontalFull[1][1].hide();
        horizontalFull[1][1].getLine().addActionListener(new Action());
        backgroundPanel.add(horizontalFull[2][1].getLine());
        backgroundPanel.add(verticalFull[1][1].getLine());
        backgroundPanel.add(verticalFull[1][2].getLine());



        ObjSpecifics boxSpec= new ObjSpecifics("grafix/box.png",40, 40, 40);
        GraphicObj box = new GraphicObj(boxSpec);
        box.setButtonProperties(180, 100, 100, 100);
        backgroundPanel.add(box.getLine());


        Environment.setBackgroundElements(backgroundPanel);




        frame.setVisible(true);

    }
};


class Action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Mani");
    }
}


