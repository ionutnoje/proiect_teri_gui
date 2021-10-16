package date_personale;

public class Cumparator implements DatePersonale
{
    public String nume;
    public String prenume;
    public int varsta;


    public Cumparator()
    {
        this.nume = "user";
        this.prenume = "user";
        this.varsta = 0;
    }

    @Override
    public void nume(String numee) {
        this.nume = numee;
    }

    @Override
    public void prenume(String prenumee) {
        this.prenume = prenumee;
    }

    @Override
    public void varsta(int varstaa) {
        this.varsta = varstaa;
    }


}

