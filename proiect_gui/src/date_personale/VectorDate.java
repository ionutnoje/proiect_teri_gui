package date_personale;

import cont_bancar.ContBancar;

public class VectorDate
{
    public static Ceo[] vector = new Ceo[20];
    public static ContBancar cb = new ContBancar(0.0);

    String nume;
    String prenume;
    int varsta;
    double suma;



    public VectorDate()
    {

    }
    public void Initializare()
    {
        Ceo[] vector = new Ceo[20];
    }



    public void IntroducereDateInVector(String nume, String prenume, int varsta, double suma)
    {
        vector[1] = new Ceo(nume,prenume,varsta,suma);
        this.nume = vector[1].nume;
        this.prenume = vector[1].prenume;
        this.varsta = vector[1].varsta;
        this.suma = vector[1].suma;


    }

    public void CreareContBancar(double suma)
    {
        cb.depunereBani(suma);
    }

}
