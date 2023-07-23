package homework.course_project.cars.services;

import homework.course_project.cars.audi.enums.AudiWheelSize;
import homework.course_project.cars.bmw.enums.BMWWheelSize;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.interfaces.WheelSize;
import homework.course_project.cars.car.service.Service;
import homework.course_project.cars.ford.enums.FordWheelSize;

import java.util.List;

import static homework.course_project.cars.utils.Utility.checkBrandHaveThisParameter;

public class ChangeWheelService extends Service {

    @Override
    public void changeWheels(Car car, WheelSize wheelSize) throws IllegalArgumentException {

        if (checkBrandHaveThisParameter(car, wheelSize, List.of(AudiWheelSize.values()), "AUDI")) {
            super.changeWheels(car, wheelSize);

        } else if (checkBrandHaveThisParameter(car, wheelSize, List.of(BMWWheelSize.values()), "BMW")) {
            super.changeWheels(car, wheelSize);

        } else if (checkBrandHaveThisParameter(car, wheelSize, List.of(FordWheelSize.values()), "FORD")) {
            super.changeWheels(car, wheelSize);
        } else {
            System.out.println((char) 27 + "[31m" + "There is no such wheelSize (" + wheelSize + ") for this brand ("
                    + car.getBrand() + "). Please, check your information!" + (char) 27 + "[0m");
        }
    }
}
