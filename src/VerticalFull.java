import javax.swing.*;


public class VerticalFull extends GraphicObj{
    public VerticalFull() {
        super();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("grafix/line_full_vertical.png").getImage().getScaledInstance(20, 50, 50));
        graphicObj.setIcon(imageIcon);
    }
}
