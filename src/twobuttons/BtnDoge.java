/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twobuttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author tomkc2421
 */
public class BtnDoge extends JButton {

    ImageIcon newdoge;
    ImageIcon newerdoge;
    int iFlip;

    BtnDoge(String file) {
        iFlip = 1;
        newdoge = new ImageIcon(file);
        newdoge.getImage();
        newerdoge = new ImageIcon("doge2.png");
        newerdoge.getImage();
        this.setIcon(newdoge);
        this.setBackground(new Color(248, 190, 169));
        AL changeImage = new AL();
        this.addActionListener(changeImage);
        //AL1 changeImage1 = new AL1();
        //this.addActionListener(changeImage1);
    }

    class AL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Hello");
            if (iFlip == 1) {
                setIcon(newerdoge);
            } else {
                setIcon(newdoge);
            }
            iFlip *= -1;
        }
    }
}
