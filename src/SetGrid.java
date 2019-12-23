import java.util.function.Supplier;

public class SetGrid {

    public static void setGrid(GraphicObj[][] graphicObj, Integer rows, Integer cols, Integer width, Integer height, Integer xOffset, Integer yOffset, Integer dist){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                graphicObj[i][j] = new GraphicObj();
                graphicObj[i][j].setButtonProperties(dist * j + xOffset, dist * i + yOffset, width, height);
            }
        }

    }
}
