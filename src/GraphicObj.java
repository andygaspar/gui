import javax.swing.*;

public class GraphicObj extends JButton{
    protected JButton graphicObj;
    public GraphicObj() {
        graphicObj=new JButton();
        graphicObj.setBorder(null);
        graphicObj.setOpaque(false);
        graphicObj.setContentAreaFilled(false);
        graphicObj.setBorderPainted(false);
    }


    public JButton getLine(){return graphicObj;}
    public void setButtonProperties(int x, int y, int w, int h){this.graphicObj.setBounds(x,y,w,h);}
}



