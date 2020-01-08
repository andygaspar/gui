import java.util.function.Supplier;

public class SetGrid {

    public static void setGrid(GraphicObj[][] graphicObj, ObjSpecifics objSpec, GridSpecifics gridSpec,BackgroundPanel bPanel, Boolean isLine){

        for (int i = 0; i < gridSpec.rows; i++) {
            for (int j = 0; j < gridSpec.cols; j++) {
                graphicObj[i][j] = new GraphicObj(objSpec,isLine);
                graphicObj[i][j].setButtonProperties(gridSpec.dist * j + gridSpec.xOffset, gridSpec.dist * i + gridSpec.yOffset, gridSpec.width, gridSpec.height);
                bPanel.add(graphicObj[i][j].getLine());
            }
        }

    }
}
