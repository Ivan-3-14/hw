package homework.course_project.cars.car.showroom;

import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.*;
import homework.course_project.cars.car.service.Service;

import java.util.Set;

public class Showroom {
    private final Service service;
    private final CarFactory factory;

    public Showroom(Service service, CarFactory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderCar (Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Set<Option> options) {
        return factory.createCar(color, model, yearOfIssue, wheelSize, volumeEng,  options);
    }

    public void changeColor(Car car, Color color) {
        service.changeColor(car, color);
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        service.changeWheels(car, wheelSize);
    }

    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }

    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }

    public void setOptions(Car car, Set<Option> options) {
        service.setOptions(car, options);
    }

//    public void printCarFactoryLists(){ factory.printListForProduction(); };

}
