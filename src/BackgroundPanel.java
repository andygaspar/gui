import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        ImageIcon img=new ImageIcon("background.jpg");
        img.paintIcon(this,g,0,0);
    }
}
