package date_personale;

public class Cumparator implements DatePersonale
{
    String nume;
    String prenume;
    int varsta;
    int sumabani;


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

    @Override
    public void sumabani(int sumabani) {
        this.sumabani = sumabani;
    }
}

