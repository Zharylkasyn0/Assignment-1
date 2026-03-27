import java.util.ArrayList;
import java.util.Scanner;

public class FleetApp {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new FleetApp().run();
    }

    public void run() {
        while (true) {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Показать все машины");
            System.out.println("2. Добавить машину (Car)");
            System.out.println("3. Добавить автобус (Bus)");
            System.out.println("4. Посчитать страховку");
            System.out.println("5. Отправить всех на сервис");
            System.out.println("6. Выход");
            System.out.print("Выбери пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) printVehicles();
            else if (choice == 2) addCar();
            else if (choice == 3) addBus();
            else if (choice == 4) showInsurance();
            else if (choice == 5) performService();
            else if (choice == 6) break;
        }
    }

    void printVehicles() {
        if (vehicles.isEmpty()) System.out.println("Список пуст!");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    void addCar() {
        System.out.print("Модель: "); String model = scanner.nextLine();
        System.out.print("Год: "); int year = scanner.nextInt();
        System.out.print("Цена: "); double price = scanner.nextDouble();
        System.out.print("Кол-во дверей: "); int doors = scanner.nextInt();
        vehicles.add(new Car(model, year, price, doors));
        System.out.println("Машина добавлена!");
    }

    void addBus() {
        System.out.print("Модель: "); String model = scanner.nextLine();
        System.out.print("Год: "); int year = scanner.nextInt();
        System.out.print("Цена: "); double price = scanner.nextDouble();
        System.out.print("Вместимость: "); int cap = scanner.nextInt();
        vehicles.add(new Bus(model, year, price, cap));
        System.out.println("Автобус добавлен!");
    }

    void showInsurance() {
        double total = 0;
        for (Vehicle v : vehicles) {
            System.out.println(v.getModel() + ": " + v.calculateInsuranceFee());
            total += v.calculateInsuranceFee();
        }
        System.out.println("Всего страховка: " + total);
    }

    void performService() {
        for (Vehicle v : vehicles) {
            if (v instanceof Servicable) {
                ((Servicable) v).performService();
            }
        }
    }
}
