// Класс, представляющий магазин игрушек

import java.util.ArrayList;
import java.util.List;

class ToyStore {
    private List<Toy> toys = new ArrayList<>();

    public void addToy(String name, double weight) {
        Toy toy = new Toy(name, weight);
        toys.add(toy);
    }

    public List<Toy> getAllToys() {
        return toys;
    }
}