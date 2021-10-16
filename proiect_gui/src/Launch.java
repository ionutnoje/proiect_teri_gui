import date_personale.DatePersonale;
import date_personale.VectorDate;
import garaj.Garaj;
import garaj.Masina;
import log_in.MyFrame;

public class Launch
{
    public static void main(String[] args) {

        Garaj grj = new Garaj();
        VectorDate vd = new VectorDate();
        grj.CreareGarajFaraAdaugara();
        new MyFrame();



    }
}
