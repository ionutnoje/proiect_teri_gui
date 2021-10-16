package ceo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeniuCeo1 extends JFrame implements ActionListener
{
    JButton afisare = new JButton("afisare garaj");
    JButton introducere = new JButton("introducere masina in garaj");
    JButton eliminare = new JButton("eliminare masina din garaj");
    JButton interogare = new JButton("interogare sold");
    JButton depozitare = new JButton("depozitare suma");
    JButton retragere = new JButton("retragere suma");



    public MeniuCeo1()
    {

        //FRAME
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(6,1,0,10));
        this.add(afisare);
        this.add(introducere);
        this.add(eliminare);
        this.add(interogare);
        this.add(depozitare);
        this.add(retragere);
        this.pack();
        this.setVisible(true);


        //BUTTONS
        afisare.setFocusable(false);
        afisare.addActionListener(this);

        introducere.setFocusable(false);
        introducere.addActionListener(this);

        eliminare.setFocusable(false);
        eliminare.addActionListener(this);

        interogare.setFocusable(false);
        interogare.addActionListener(this);

        depozitare.setFocusable(false);
        depozitare.addActionListener(this);

        retragere.setFocusable(false);
        retragere.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == afisare)
        {
            new Afisare();
            this.setVisible(false);
            System.out.println("butonul afisare a fost apasat");
        }
        else if(e.getSource() == introducere)
        {
            System.out.println("butonul introducere a fost apasat");
            new IntroducereInGaraj();
            this.setVisible(false);
        }
        else if(e.getSource() == eliminare)
        {
            System.out.println("butonul eliminare a fost apasat");
        }
        else if(e.getSource() == interogare)
        {
            System.out.println("butonul interogare a fost apasat");
        }
        else if(e.getSource() == retragere)
        {
            System.out.println("butonul retragere a fost apasat");
        }
    }
}
