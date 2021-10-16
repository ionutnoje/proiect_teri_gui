import garaj.Garaj;
import garaj.Masina;
import log_in.MyFrame;

public class Launch
{
    public static void main(String[] args) {

        Garaj grj = new Garaj();
        new MyFrame();
        grj.CreareGarajFaraAdaugara();

    }
}
