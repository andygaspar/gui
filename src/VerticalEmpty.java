import javax.swing.*;


public class VerticalEmpty extends  GraphicObj{

    public VerticalEmpty() {
        super();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("grafix/line_empty_vertical.png").getImage().getScaledInstance(20, 50, 50));
        graphicObj.setIcon(imageIcon);

    }
}
