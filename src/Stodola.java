import java.util.ArrayList;

public class Stodola {
    private ArrayList<Animal> malaZvirata;
    private ArrayList<Animal> velkaZvirata;

    public void koupitMaleZvire(Animal animal) {
        if (malaZvirata.size() <= 10) {
            malaZvirata.add(animal);
        }
    }
}
