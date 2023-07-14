package homework.course_project.cars.car.service;

import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.Color;
import homework.course_project.cars.car.model.enums.Option;
import homework.course_project.cars.car.model.enums.WheelSize;

import java.util.Set;

public class Service {
    public void changeColor(Car car, Color color) {
        if (car != null && color != null && !color.equals(car.getColor())) {
            car.setColor(color);
        }
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && wheelSize != car.getWheelSize()) {
            car.setWheelSize(wheelSize);
        }
    }

    public void addOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOption().add(option);
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOption().remove(option);
        }
    }

    public void setOptions(Car car, Set<Option> options) {
        if (car != null && options != null) {
            car.setOption(options);
        }
    }
}
