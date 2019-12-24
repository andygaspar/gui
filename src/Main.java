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

        ObjSpecifics hFullSpec= new ObjSpecifics("grafix/line_full.png",50, 20, 50);
        GridSpecifics hfGridSpec=new GridSpecifics(6,5,50, 50, 155, 50 , 50);
        GraphicObj[][] horizontalFull=new GraphicObj[hfGridSpec.rows][hfGridSpec.cols];
        SetGrid.setGrid(horizontalFull,hFullSpec,hfGridSpec,backgroundPanel,false);


        ObjSpecifics vFullSpec= new ObjSpecifics("grafix/line_full_vertical.png",20, 50, 50);
        GridSpecifics vfGridSpec=new GridSpecifics(5,6,50, 50, 130, 75 , 50);
        GraphicObj[][] verticalFull=new GraphicObj[vfGridSpec.rows][vfGridSpec.cols];
        SetGrid.setGrid(verticalFull,vFullSpec,vfGridSpec,backgroundPanel,false);




        backgroundPanel.add(horizontalFull[1][1].getLine());
        backgroundPanel.add(horizontalFull[2][1].getLine());
        backgroundPanel.add(verticalFull[1][1].getLine());
        backgroundPanel.add(verticalFull[1][2].getLine());



        ObjSpecifics boxSpec= new ObjSpecifics("grafix/box.png",40, 40, 40);
        GraphicObj box = new GraphicObj(boxSpec);
        box.setButtonProperties(180, 100, 100, 100);
        backgroundPanel.add(box.getLine());


        ObjSpecifics dotSpec= new ObjSpecifics("grafix/dot.png",10, 10, 50);
        GridSpecifics dotGridSpec=new GridSpecifics(6,6,50, 50, 130, 50 , 50);
        GraphicObj[][] dots=new GraphicObj[dotGridSpec.rows][dotGridSpec.cols];
        SetGrid.setGrid(dots,dotSpec,dotGridSpec,backgroundPanel,true);



        ObjSpecifics hEmptySpec= new ObjSpecifics("grafix/line_empty.png",50, 20, 50);
        GridSpecifics heGridSpec=new GridSpecifics(6,5,50, 50, 155, 50 , 50);
        GraphicObj[][] horizontalEmpty=new GraphicObj[heGridSpec.rows][heGridSpec.cols];
        SetGrid.setGrid(horizontalEmpty,hEmptySpec,heGridSpec,backgroundPanel,true);


        ObjSpecifics vEmptySpec= new ObjSpecifics("grafix/line_empty_vertical.png",20, 50, 50);
        GridSpecifics veGridSpec=new GridSpecifics(5,6,50, 50, 130, 75 , 50);
        GraphicObj[][] verticalEmpty=new GraphicObj[veGridSpec.rows][veGridSpec.cols];
        SetGrid.setGrid(verticalEmpty,vEmptySpec,veGridSpec,backgroundPanel,true);




        frame.setVisible(true);

    }
};



