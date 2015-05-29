package twobuttons;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class PanDisp extends JPanel{

    ImageIcon newdoge;

    public PanDisp(PanOut _panOut) {
        BtnDoge btn = new BtnDoge("doge1.png","1");
        btn.setActionCommand("1");
        add(btn);
        BtnDoge btn2 = new BtnDoge("doge1.png", "2");
        btn2.setActionCommand("2");
        add(btn2);
    }
}