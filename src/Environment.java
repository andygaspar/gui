import javax.swing.*;
import java.awt.*;

public class Environment {

    public static void setBackgroundElements(BackgroundPanel backgroundPanel){


        ObjSpecifics hEmptySpec= new ObjSpecifics("grafix/line_empty.png","grafix/line_full.png",50, 20, 50);
        GridSpecifics heGridSpec=new GridSpecifics(6,5,50, 15, 155, 68 , 50);
        GraphicObj[][] horizontalEmpty=new GraphicObj[heGridSpec.rows][heGridSpec.cols];
        SetGrid.setGrid(horizontalEmpty,hEmptySpec,heGridSpec,backgroundPanel,true);


        ObjSpecifics vEmptySpec= new ObjSpecifics("grafix/line_empty_vertical.png","grafix/line_full_vertical.png",20, 50, 50);
        GridSpecifics veGridSpec=new GridSpecifics(5,6,15, 50, 150, 75 , 50);
        GraphicObj[][] verticalEmpty=new GraphicObj[veGridSpec.rows][veGridSpec.cols];
        SetGrid.setGrid(verticalEmpty,vEmptySpec,veGridSpec,backgroundPanel,true);


        ObjSpecifics dotSpec= new ObjSpecifics("grafix/dot.png","",10, 10, 50);
        GridSpecifics dotGridSpec=new GridSpecifics(6,6,50, 50, 130, 50 , 50);
        GraphicObj[][] dots=new GraphicObj[dotGridSpec.rows][dotGridSpec.cols];
        SetGrid.setGrid(dots,dotSpec,dotGridSpec,backgroundPanel,false);
    }
}
