package homework.course_project.cars.car.showroom;

import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.factory.Wrapper;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.interfaces.*;
import homework.course_project.cars.car.service.Service;

import java.util.Set;

public abstract class Showroom {
    private final Service service;
    private final CarFactory factory;

    public Showroom(Service service, CarFactory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderCar(Brand brand, Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Wrapper wrapper) {
        return factory.createCar(brand, color, model, yearOfIssue, wheelSize, volumeEng, wrapper, factory.getStock());
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
        service.changeOptions(car, options);
    }

    public void printCarFactoryLists() {
        factory.printListForProduction();
    }

    ;

}
