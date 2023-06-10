package homework.three.functional;

import homework.three.lists.Color;
import homework.three.lists.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShowRoomCars {


    public ShowRoomCars() {
        Set<String> myCarOptions = new HashSet<>();

        Car myCar = new Car(Color.BlUE, Model.ATLAS, 2020, 18, 2.0, myCarOptions);
        myCarOptions.add("CONDITIONER");
        myCarOptions.add("ARMREST");
        myCarOptions.add("ESPSYSTEM");

        CarFactory factory = new CarFactory(myCar);
        Stock stock = new Stock();
        List<Car> cars = stock.cars;

        factory.findSuitCar(myCar.getColor(), myCar.getModel(), myCar.getYearOfIssue(), myCar.getWheelSize(),
                myCar.getVolumeEng(), myCar.getOption(), cars
        );

        factory.create(myCar.getColor(), myCar.getModel(), myCar.getYearOfIssue(), myCar.getWheelSize(),
                myCar.getVolumeEng(),myCar.getOption()
        );
    }
}
