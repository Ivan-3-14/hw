package homework.course_project.cars.ford;

import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.ford.enums.*;
import homework.course_project.cars.ford.fordfactory.WrapperFord;


public class Ford extends Car {

    public Ford(FordBrand fordBrand, FordColor color, FordModel model, int yearOfIssue, FordWheelSize wheelSize,
                FordVolumeEng volumeEng, WrapperFord wrapperFord) {
        super(fordBrand, color, model, yearOfIssue, wheelSize, volumeEng, wrapperFord);
    }
}
