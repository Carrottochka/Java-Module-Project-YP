import java.util.ArrayList;

public class Race {
    public Car winner(ArrayList<Car> cars) {
        if (cars.size() == 0 || cars == null) {
            return null;
        }
        Car carWin = cars.get(0);

        for (int i = 1; i < cars.size(); i++) {
            int distance = 24 * cars.get(i).speed;
            if (distance > carWin.speed * 24) {
                carWin = cars.get(i);

            }

        }

        return carWin;

    }
}







