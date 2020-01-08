import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicObj extends JFrame implements ActionListener{
    protected JButton graphicObj;
    protected ObjSpecifics objSpec;


    public GraphicObj(ObjSpecifics os, Boolean isLine) {
        objSpec=os;
        graphicObj = new JButton();
        graphicObj.setBorder(null);
        graphicObj.setOpaque(false);
        graphicObj.setContentAreaFilled(false);
        graphicObj.setBorderPainted(false);
        graphicObj.setFocusPainted(false);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(objSpec.fileName).getImage().getScaledInstance(objSpec.width, objSpec.height, objSpec.hints));
        graphicObj.setIcon(imageIcon);
        if (isLine == true)
            graphicObj.addActionListener(this);

    }

    public JButton getLine(){return graphicObj;}
    //public void setButtonProperties(int x, int y, int w, int h){this.graphicObj.setBounds(x,y,w,h);}
    public void setButtonProperties(int x, int y, int w, int h){this.graphicObj.setBounds(x,y,w,h);}


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == graphicObj)
        {
            System.out.println("mandi");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(objSpec.fileName2).getImage().getScaledInstance(objSpec.width, objSpec.height, objSpec.hints));
            graphicObj.setIcon(imageIcon);

        }
    }
}






