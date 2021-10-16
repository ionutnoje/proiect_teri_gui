package ceo;

import garaj.Garaj;

import javax.swing.*;
import java.awt.*;

public class AfisareInformatiiMasina extends JFrame
{
    JLabel label = new JLabel();
    Garaj garaj = new Garaj();
    String info;


    public  AfisareInformatiiMasina(int val)
    {
        garaj.CreareGarajFaraAdaugara();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,120);
        this.add(label);



        this.setVisible(true);


        info = garaj.toString(val);
        label.setBounds(0,0,800,120);
        label.setText(info);

    }
}
