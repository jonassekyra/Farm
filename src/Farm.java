import java.util.ArrayList;
public class Farm {

    public Farm() {
        kytky = new ArrayList<>();
    }

    private double volnemistoVha = 100;
    private ArrayList<Flower> kytky;

    public void pridaniRostlin(Flower f){
        if (f.getNeededArea()<volnemistoVha){
            kytky.add(f);
            volnemistoVha -= f.getNeededArea();
        }

    }

    public void zavlazeniRostlin(Flower f){
        f.setWatered(true);
    }

    public void zklizeniRostlin(Flower f){
        kytky.remove(f);
    }





}
