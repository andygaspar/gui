import javax.swing.*;

public class Box extends GraphicObj{
    public Box() {
        super();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("grafix/box.png").getImage().getScaledInstance(40, 40, 40));
        graphicObj.setIcon(imageIcon);
    }
}

