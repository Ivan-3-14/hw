package homework.course_project.cars.showroom;

import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.*;
import homework.course_project.cars.car.service.Service;
import homework.course_project.cars.car.showroom.Showroom;

import java.util.Set;

public class ShowroomABF extends Showroom {

    public ShowroomABF(Service service, CarFactory factory) {
        super(service, factory);
    }

    @Override
    public Car orderCar(Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Set<Option> options) {
        return super.orderCar(color, model, yearOfIssue, wheelSize, volumeEng, options);
    }

    @Override
    public void changeColor(Car car, Color color) {
        super.changeColor(car, color);
    }

    @Override
    public void changeWheels(Car car, WheelSize wheelSize) {
        super.changeWheels(car, wheelSize);
    }

    @Override
    public void addOption(Car car, Option option) {
        super.addOption(car, option);
    }

    @Override
    public void deleteOption(Car car, Option option) {
        super.deleteOption(car, option);
    }

    @Override
    public void setOptions(Car car, Set<Option> options) {
        super.setOptions(car, options);
    }
}
