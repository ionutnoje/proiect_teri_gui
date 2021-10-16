package ceo;

import garaj.Garaj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StergereMasinaCeo extends Afisare implements ActionListener
{
    int val;
    Garaj garaj = new Garaj();

//    public StergereMasinaCeo()
//    {
//        new Afisare();
//
//    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == masina1)
        {
            val = 1;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina2)
        {
            val = 2;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina3)
        {
            val = 3;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina4)
        {
            val = 4;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina5)
        {
            val = 5;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina6)
        {
            val = 6;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina7)
        {
            val = 7;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina8)
        {
            val = 8;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == masina9)
        {
            val = 9;
            masina1.setVisible(false);
            garaj.EliminareDinGarajCeo(val);
        }
        else if(e.getSource() == exit)
        {
            System.exit(0);
        }
        else if(e.getSource() == back)
        {
            this.setVisible(false);
            new MeniuCeo1();
        }
    }
}
