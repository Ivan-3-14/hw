package homework.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {

        List<Car> cars = new ArrayList<>();

    public Stock(){
        cars.add(new Car(Color.GREEN, Model.GEOMETRY, 2020, 15, 1.6));
        cars.add(new Car(Color.BlUE, Model.ATLAS, 2020, 18, 2.0));
        cars.add(new Car(Color.YELLOW, Model.TUGELLA, 2023, 17, 1.6));
        cars.add(new Car(Color.BLACK, Model.EMGRAND, 2020, 14, 1.4));
        cars.add(new Car(Color.GRAY, Model.COOLRAY, 2023, 17, 2.0));
        cars.add(new Car(Color.VIOLET, Model.GEOMETRY, 2021, 14, 1.8));
        cars.add(new Car(Color.WHITE, Model.OKVANGO, 2020, 16, 1.6));
        cars.add(new Car(Color.RED, Model.EMGRAND, 2022, 15, 1.6));
        cars.add(new Car(Color.ORANGE, Model.ATLAS, 2020, 18, 2.0));
    }

        public void printStock() {
        for (var s : cars) {
            System.out.print(s + "\n");
        }
    }

    @Override
    public String toString() {
        return "Stock{}";
    }
}
