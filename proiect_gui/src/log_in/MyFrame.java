package log_in;

import ceo.MeniuCeo1;
import date_personale.DateFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{
    JLabel ceo = new JLabel();
    JLabel cumparator = new JLabel();
    JLabel firma = new JLabel();

    JButton ceob = new JButton();
    JButton cumparatorb = new JButton();


    JMenuBar menuBar = new JMenuBar();
    JMenu meniuNavigare = new JMenu("navigare");

    JMenuItem exitItem = new JMenuItem("exit");

    public MyFrame()
    {




        //Frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(330,250);
        this.add(firma);

        this.add(ceo);
        this.add(cumparator);
        this.add(ceob);
        this.add(cumparatorb);
        this.setJMenuBar(menuBar);

        this.setTitle("Log in/Sign in");
        this.setVisible(true);


        //Labels
        ceo.setText("CEO");
        ceo.setBounds(75,50,50,50);


        cumparator.setText("CUMPARATOR");
        cumparator.setBounds(190,50,100,50);


        firma.setText("dealer-auto.ro");
        firma.setBounds(125,20,90,20);



        //BUTTONS
        ceob.setText("CONECTARE");
        ceob.setBounds(25,100,130,15);
        ceob.setFocusable(false);
        ceob.addActionListener(this);




        cumparatorb.setText("CONECTARE");
        cumparatorb.setBounds(170,100,130,15);
        cumparatorb.setFocusable(false);
        cumparatorb.addActionListener(this);



        //MENUBAR

        menuBar.add(meniuNavigare);
        meniuNavigare.add(exitItem);
        exitItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ceob)
        {
            System.out.println("ati apasat butonul de conectare pentru ceo");
            new DateFrame();
            this.setVisible(false);
        }
        else if(e.getSource() == cumparatorb)
        {
            System.out.println("ati apasat butonul de conectare pentru cumparator");
            new DateFrame();
        }
        else if(e.getSource() == exitItem)
        {
            System.exit(0);
        }
    }
}
