// Класс, представляющий розыгрыш

import java.util.List;

class ToyLottery {
    private ToyStore toyStore;

    public ToyLottery(ToyStore toyStore) {
        this.toyStore = toyStore;
    }

    public Toy drawWinner() {
        List<Toy> allToys = toyStore.getAllToys();
        if (allToys.isEmpty()) {
            return null; // Нет доступных игрушек для розыгрыша
        }

        double totalWeight = allToys.stream().mapToDouble(Toy::getWeight).sum();
        double randomValue = Math.random() * totalWeight;

        double cumulativeWeight = 0.0;
        for (Toy toy : allToys) {
            cumulativeWeight += toy.getWeight();
            if (randomValue <= cumulativeWeight) {
                return toy;
            }
        }

        return null; // Не должно произойти, если все веса корректны
    }
}