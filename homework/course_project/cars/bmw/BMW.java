package homework.course_project.cars.bmw;

import homework.course_project.cars.bmw.bmwfactory.WrapperBMW;
import homework.course_project.cars.bmw.enums.*;
import homework.course_project.cars.car.model.Car;

public class BMW extends Car {


    public BMW(BMWBrand bmwBrand, BMWColor color, BMWModel model, int yearOfIssue, BMWWheelSize wheelSize, BMWVolumeEng volumeEng, WrapperBMW wrapperBMW) {
        super(bmwBrand, color, model, yearOfIssue, wheelSize, volumeEng, wrapperBMW);
    }
}
