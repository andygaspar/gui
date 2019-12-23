import javax.swing.*;

public class HorizontalFull  extends GraphicObj{
    public HorizontalFull() {
        super();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("grafix/line_full.png").getImage().getScaledInstance(50, 20, 50));
        graphicObj.setIcon(imageIcon);

    }
}
