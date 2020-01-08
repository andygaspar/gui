import javax.swing.*;

public class GraphicObj{
    protected JButton graphicObj;
    public GraphicObj(String fileName, Integer width, Integer height, Integer hints) {
        graphicObj=new JButton();
        graphicObj.setBorder(null);
        graphicObj.setOpaque(false);
        graphicObj.setContentAreaFilled(false);
        graphicObj.setBorderPainted(false);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(50, 20, 50));
        graphicObj.setIcon(imageIcon);
    }

    public GraphicObj(ObjSpecifics objSpec){
        graphicObj=new JButton();
        graphicObj.setBorder(null);
        graphicObj.setOpaque(false);
        graphicObj.setContentAreaFilled(false);
        graphicObj.setBorderPainted(false);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(objSpec.fileName).getImage().getScaledInstance(objSpec.width, objSpec.height, objSpec.hints));
        graphicObj.setIcon(imageIcon);
    }


    public JButton getLine(){return graphicObj;}
    public void setButtonProperties(int x, int y, int w, int h){this.graphicObj.setBounds(x,y,w,h);}
    public void hide(){
        graphicObj.setVisible(false);
    }
}




