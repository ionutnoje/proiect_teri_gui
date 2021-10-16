package date_personale;

import cont_bancar.ContBancar;

public class Ceo implements DatePersonale
{
    public String nume;
    public String prenume;
    public int varsta;
    public double suma;
    Ceo[] vect = new Ceo[20];
    ContBancar cb = new ContBancar(0);

    public Ceo()
    {
        this.nume = "user";
        this.prenume = "user";
        this.varsta = 0;
        this.suma = 0;

    }


    public Ceo(String nume,String prenume,int varsta,double suma)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.suma = suma;
        cb.depunereBani(suma);
    }


    @Override
    public void nume(String nume) {
        this.nume = nume;
    }

    @Override
    public void prenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public void varsta(int varsta) {
        this.varsta = varsta;
    }
}
