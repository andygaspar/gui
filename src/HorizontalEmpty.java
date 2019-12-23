import javax.swing.*;


public class HorizontalEmpty extends GraphicObj{
    public HorizontalEmpty() {
        super();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("grafix/line_empty.png").getImage().getScaledInstance(50, 20, 50));
        graphicObj.setIcon(imageIcon);
    }
}
