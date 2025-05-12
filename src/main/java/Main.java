import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Race win = new Race();
        for (int i = 1; i < 4; i++) {

            String name = "";
            while (name.isEmpty()) {
                System.out.printf("Введите наименование машины №%d ", i);
                name = scanner.nextLine().trim();
            }

            int speed = 0;

            while (speed <= 0 || speed > 250) {
                System.out.printf("Введите скорость машины №%d ", i);
                try {
                    //speed = scanner.nextInt();
                    String l = scanner.nextLine();
                    speed = Integer.parseInt(l.trim());
                    //Double sm=scanner.nextDouble();

                } catch (Exception e) {
                    System.out.println("Введите целое число от 0 до 250");
                }
            }


            Car car = new Car(name, speed);
            cars.add(car);


        }
        Car fin = win.winner(cars);
        System.out.println("Победитель :" + fin.name);
    }

}

