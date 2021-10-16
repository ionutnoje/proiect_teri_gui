package ceo;

import garaj.Garaj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroducereInGaraj extends JFrame implements ActionListener
{
    String culoarev;
    String tipv;
    String marcav;
    String modelv;
    int vinv;
    int kmv;
    double pretv;
    int stockv;
    int hpv;

    Garaj garaj = new Garaj();



    JLabel marca = new JLabel("marca");
    JLabel model = new JLabel("model");
    JLabel vin = new JLabel("vin");
    JLabel tip = new JLabel("tip");
    JLabel hp = new JLabel("hp");
    JLabel culoare = new JLabel("culoare");
    JLabel km = new JLabel("km");
    JLabel pret = new JLabel("pret");
    JLabel stock = new JLabel("stock");

    JTextField marcat = new JTextField();
    JTextField modelt = new JTextField();
    JTextField vint = new JTextField();
    JTextField tipt = new JTextField();
    JTextField hpt = new JTextField();
    JTextField culoaret = new JTextField();
    JTextField kmt = new JTextField();
    JTextField prett = new JTextField();
    JTextField stockt = new JTextField();


    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton buton = new JButton("Adaugare");





    public IntroducereInGaraj()
    {
        //FRAME
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(600,400);
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.SOUTH);

        this.setVisible(true);



        //panel1
        panel1.setLayout(new GridLayout(9,2,10,10));
        panel1.add(marca);
        panel1.add(marcat);
        panel1.add(model);
        panel1.add(modelt);
        panel1.add(vin);
        panel1.add(vint);
        panel1.add(tip);
        panel1.add(tipt);
        panel1.add(hp);
        panel1.add(hpt);
        panel1.add(culoare);
        panel1.add(culoaret);
        panel1.add(km);
        panel1.add(kmt);
        panel1.add(pret);
        panel1.add(prett);
        panel1.add(stock);
        panel1.add(stockt);


        //panel2
        panel2.setLayout(new BorderLayout());
        panel2.add(buton,BorderLayout.CENTER);


        buton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buton)
        {
            marcav = marcat.getText();
            modelv = modelt.getText();
            vinv = Integer.parseInt(vint.getText());
            tipv = tipt.getText();
            hpv = Integer.parseInt(hpt.getText());
            culoarev = culoaret.getText();
            kmv = Integer.parseInt(kmt.getText());
            pretv = Integer.parseInt(prett.getText());
            stockv = Integer.parseInt(stockt.getText());

            System.out.println("marca adaugat est : " + marcav);
            System.out.println("modelv adaugat est : " + modelv);
            System.out.println("vinv adaugat est : " + vinv);
            System.out.println("tipv adaugat est : " + tipv);
            System.out.println("hpv adaugat est : " + hpv);
            System.out.println("culoarev adaugat est : " + culoarev);
            System.out.println("kmv adaugat est : " + kmv);
            System.out.println("pretv adaugat est : " + pretv);
            System.out.println("stockv adaugat est : " + stockv);

            garaj.AdaugareInGarajCeo(culoarev,tipv,marcav,modelv,vinv,kmv,pretv,stockv,hpv);

        }
    }
}
