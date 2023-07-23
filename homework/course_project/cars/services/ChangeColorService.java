package homework.course_project.cars.services;

import homework.course_project.cars.audi.enums.AudiColor;
import homework.course_project.cars.bmw.enums.BMWColor;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.interfaces.Color;
import homework.course_project.cars.car.service.Service;
import homework.course_project.cars.ford.enums.FordColor;

import java.util.List;

import static homework.course_project.cars.utils.Utility.checkBrandHaveThisParameter;

public class ChangeColorService extends Service {

    @Override
    public void changeColor(Car car, Color color) {
        if (checkBrandHaveThisParameter(car, color, List.of(AudiColor.values()), "AUDI")) {
            super.changeColor(car, color);

        } else if (checkBrandHaveThisParameter(car, color, List.of(BMWColor.values()), "BMW")) {
            super.changeColor(car, color);

        } else if (checkBrandHaveThisParameter(car, color, List.of(FordColor.values()), "FORD")) {
            super.changeColor(car, color);
        } else {
            System.out.println((char) 27 + "[31m" + "There is no such color (" + color + ") for this brand ("
                    + car.getBrand() + "). Please, check your information!" + (char) 27 + "[0m");
        }
    }
}
