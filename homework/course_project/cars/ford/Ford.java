package homework.course_project.cars.ford;

import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.Option;
import homework.course_project.cars.ford.enums.FordColor;
import homework.course_project.cars.ford.enums.FordModel;
import homework.course_project.cars.ford.enums.FordVolumeEng;
import homework.course_project.cars.ford.enums.FordWheelSize;

import java.util.Set;

public class Ford extends Car {
    public Ford(FordColor color, FordModel model, int yearOfIssue, FordWheelSize wheelSize, FordVolumeEng volumeEng, Set<Option> options) {
        super(color, model, yearOfIssue, wheelSize, volumeEng, options);
    }

    @Override
    public void printCar(Car car) {
        System.out.println("Ford" + car + "");
    }
}
