package ceo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afisare extends JFrame implements ActionListener
{
    int valbuton;

    JButton masina1 = new JButton();
    JButton masina2 = new JButton();
    JButton masina3 = new JButton();
    JButton masina4 = new JButton();
    JButton masina5 = new JButton();
    JButton masina6 = new JButton();
    JButton masina7 = new JButton();
    JButton masina8 = new JButton();
    JButton masina9 = new JButton();
    JButton masina10 = new JButton();

    JPanel titlu = new JPanel();
    JPanel grid = new JPanel();
    JPanel panel = new JPanel(new BorderLayout());

    ImageIcon image1 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/ferrari458.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image2 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/audia4.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image3 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/audir8.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image4 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/bmwm4.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image5 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/ferrari812.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image6 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/lamborghinihuracan.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image7 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/nissangtr.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image8 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/passat.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image9 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/supra.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));
    ImageIcon image10 = new ImageIcon(new ImageIcon("proiect_gui/src/garaj/ferrari458.jpg").getImage().getScaledInstance(220,200,Image.SCALE_DEFAULT));


    JScrollPane scrollBar = new JScrollPane(grid);

    public Afisare()
    {

        //FRAME

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(800,400);



        this.add(titlu,BorderLayout.NORTH);
        this.add(panel,BorderLayout.CENTER);
        this.setVisible(true);
        //this.add(scrollBar);

        //scrollBar.add(grid);



        scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //GRID
        grid.setLayout(new GridLayout(6,3,10,10));
        //grid.setLayout(new FlowLayout());
        grid.add(masina1);
        grid.add(masina2);
        grid.add(masina3);
        grid.add(masina4);
        grid.add(masina5);
        grid.add(masina6);
        grid.add(masina7);
        grid.add(masina8);
        grid.add(masina9);
        grid.add(masina10);


        panel.add(scrollBar,BorderLayout.CENTER);



//        titlu.add(new JLabel("titlul"),BorderLayout.NORTH);
//        titlu.setSize(100,100);




        //BUTTONS
        masina1.setIcon(image1);
        masina2.setIcon(image2);
        masina3.setIcon(image3);
        masina4.setIcon(image4);
        masina5.setIcon(image5);
        masina6.setIcon(image6);
        masina7.setIcon(image7);
        masina8.setIcon(image8);
        masina9.setIcon(image9);
        masina10.setIcon(image10);

        masina1.setFocusable(false);
        masina2.setFocusable(false);
        masina3.setFocusable(false);
        masina4.setFocusable(false);
        masina5.setFocusable(false);
        masina6.setFocusable(false);
        masina7.setFocusable(false);
        masina8.setFocusable(false);
        masina9.setFocusable(false);
        masina10.setFocusable(false);




        masina1.addActionListener(this);
        masina2.addActionListener(this);
        masina3.addActionListener(this);
        masina4.addActionListener(this);
        masina5.addActionListener(this);
        masina6.addActionListener(this);
        masina7.addActionListener(this);
        masina8.addActionListener(this);
        masina9.addActionListener(this);
        masina10.addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == masina1)
        {
            valbuton = 1;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina2)
        {
            valbuton = 2;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina3)
        {
            valbuton = 3;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina4)
        {
            valbuton = 4;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina5)
        {
            valbuton = 5;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina6)
        {
            valbuton = 6;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina7)
        {
            valbuton = 7;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina8)
        {
            valbuton = 8;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina9)
        {
            valbuton = 9;
            new AfisareInformatiiMasina(valbuton);

        }
        else if(e.getSource() == masina10)
        {
            valbuton = 10;
            new AfisareInformatiiMasina(valbuton);

        }
    }
}
