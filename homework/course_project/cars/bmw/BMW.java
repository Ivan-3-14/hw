package homework.course_project.cars.bmw;

import homework.course_project.cars.bmw.enums.BMWColor;
import homework.course_project.cars.bmw.enums.BMWModel;
import homework.course_project.cars.bmw.enums.BMWVolumeEng;
import homework.course_project.cars.bmw.enums.BMWWheelSize;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.Model;
import homework.course_project.cars.car.model.enums.Option;

import java.util.Set;

public class BMW extends Car {



    public BMW(BMWColor color, BMWModel model, int yearOfIssue, BMWWheelSize wheelSize, BMWVolumeEng volumeEng, Set<Option> options) {
        super(color, model, yearOfIssue, wheelSize, volumeEng, options);
    }

    @Override
    public void printCar(Car car) {
        System.out.println("BMW" + car + "");
    }
}
