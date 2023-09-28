import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        ToyLottery toyLottery = new ToyLottery(toyStore);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить новую игрушку");
            System.out.println("2. Запустить розыгрыш");
            System.out.println("3. Выйти из программы");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            switch (choice) {
                case 1:
                    System.out.println("Введите название игрушки:");
                    String name = scanner.nextLine();
                    System.out.println("Введите вес игрушки:");
                    double weight = scanner.nextDouble();
                    toyStore.addToy(name, weight);
                    System.out.println("Игрушка успешно добавлена!");
                    break;
                case 2:
                    Toy winner = toyLottery.drawWinner();
                    if (winner != null) {
                        System.out.println("Победила игрушка: " + winner.getName());
                    } else {
                        System.out.println("Нет доступных игрушек для розыгрыша.");
                    }
                    break;
                case 3:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}
