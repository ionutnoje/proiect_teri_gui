package ceo;

import cont_bancar.ContBancar;
import date_personale.Ceo;
import date_personale.Cumparator;
import date_personale.VectorDate;

import javax.swing.*;

public class InterogareSold extends JFrame
{
    double suma;
    JLabel label1 = new JLabel();
    ContBancar cb = new ContBancar();
    Ceo ceo = new Ceo();
    VectorDate vd = new VectorDate();

    public InterogareSold()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,100);
        this.add(label1);


        this.setVisible(true);


        suma = cb.get_sold();
        label1.setBounds(0,0,300,100);
        vd.Initializare();
        label1.setText("detineti: " + cb.get_sold());




    }
}
