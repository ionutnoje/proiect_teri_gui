package date_personale;

import ceo.MeniuCeo1;
import cont_bancar.ContBancar;
import log_in.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DateFrame extends JFrame implements ActionListener
{
    VectorDate vd = new VectorDate();
    Ceo ceo;
    JMenuBar menuBar = new JMenuBar();
    JMenu navigare = new JMenu("navigare");
    JMenuItem exit = new JMenuItem("exit");

    JMenuItem back = new JMenuItem("back");

    Ceo dateCeo = new Ceo();

    int val;

    String nume;
    String prenume;
    int varsta;
    double sumabani;


    JLabel numel = new JLabel("nume: ");
    JLabel prenumel = new JLabel("prenume: ");
    JLabel varstal = new JLabel("varsta: ");
    JLabel sumabanil = new JLabel("suma bani: ");

    JTextField numet = new JTextField();
    JTextField prenumet = new JTextField();
    JTextField varstat = new JTextField();
    JTextField sumabanit = new JTextField();

    JButton buton = new JButton("adaugare date");

    ContBancar cb = new ContBancar(0.0);


    public DateFrame(int val)
    {
        //FRAME
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5,2,10,10));
        this.setSize(500,300);
        this.add(numel);
        this.add(numet);
        this.add(prenumel);
        this.add(prenumet);
        this.add(varstal);
        this.add(varstat);
        this.add(sumabanil);
        this.add(sumabanit);
        this.add(buton);
        this.setJMenuBar(menuBar);

        this.setVisible(true);


        //TEXTFIELDS




        //BUTTON
        buton.setFocusable(false);
        buton.addActionListener(this);


        //JMENUBAR
        menuBar.add(navigare);
        navigare.add(exit);
        exit.addActionListener(this);
        navigare.add(back);
        back.addActionListener(this);


        this.val = val;







    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buton && val == 1)
        {


            nume = numet.getText();
            prenume = prenumet.getText();
            varsta = Integer.parseInt(varstat.getText());
            sumabani = Double.parseDouble(sumabanit.getText());
            vd.IntroducereDateInVector(nume,prenume,varsta,sumabani);
            System.out.println(vd.vector[1].nume);
            System.out.println(vd.vector[1].prenume);
            System.out.println(vd.vector[1].varsta);
            System.out.println(vd.vector[1].suma);

            this.setVisible(false);
            new MeniuCeo1();



        }
        if(e.getSource() == buton && val == 2)
        {
            nume = numet.getText();
            prenume = prenumet.getText();
            varsta = Integer.parseInt(varstat.getText());
            sumabani = Integer.parseInt(sumabanit.getText());

            cb.depunereBani(sumabani);

            System.out.println(nume);
            System.out.println(prenume);
            System.out.println(varsta);
            System.out.println(sumabani);

            this.setVisible(false);
            new MeniuCeo1();



        }
        else if(e.getSource() == exit)
        {
            System.exit(0);
        }
        else if(e.getSource() == back)
        {
            this.setVisible(false);
            new MyFrame();
        }
    }


}
