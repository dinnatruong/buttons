
package twobuttons;

import java.awt.*;
import javax.swing.*;


public class PanMain extends JPanel{
    PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    private PanOut PanOut;

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
    }
    
}
