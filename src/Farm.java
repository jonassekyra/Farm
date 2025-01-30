import java.util.ArrayList;
public class Farm {

    private ArrayList<Flower> kytky;

    public void pridaniRostlin(Flower f){
        kytky.add(f);
    }

    public void zavlazeniRostlin(Flower f){
        f.setWatered(true);
    }

    public void zklizeniRostlin(Flower f){
        kytky.remove(f);
    }





}
