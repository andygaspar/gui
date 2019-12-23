import javax.swing.*;

public class Dot extends GraphicObj{
    public Dot() {
        super();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("grafix/dot.png").getImage().getScaledInstance(10, 10, 50));
        graphicObj.setIcon(imageIcon);
    }
}

