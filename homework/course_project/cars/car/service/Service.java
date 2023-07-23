package homework.course_project.cars.car.service;

import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.interfaces.Color;
import homework.course_project.cars.car.model.interfaces.Option;
import homework.course_project.cars.car.model.interfaces.WheelSize;

import java.util.Set;

public abstract class Service {
    public void changeColor(Car car, Color color) {
        if (car != null && color != null && !color.equals(car.getColor())) {
            System.out.println("Color Service: color (" + car.getColor() + ") is change on (" + color + ")");
            car.setColor(color);
        } else {
            assert car != null;
            if (color == car.getColor()) {
                System.out.println("This color (" + car.getColor() + ") are already installed on the car");
            } else {
                System.out.println((char) 27 + "[31m" + "Car or color is null" + (char) 27 + "[0m");
            }
        }
    }

    public void changeWheels(Car car, WheelSize wheelSize) {
        if (car != null && wheelSize != null && wheelSize != car.getWheelSize()) {
            System.out.println("Wheels Service: wheel size (" + car.getWheelSize() + ") is change on (" + wheelSize + ")");
            car.setWheelSize(wheelSize);
        } else {
            assert car != null;
            if (wheelSize == car.getWheelSize()) {
                System.out.println("Wheels of this size (" + car.getWheelSize() + ") are already installed on the car");
            } else {
                System.out.println((char) 27 + "[31m" + "Car or wheel size is null" + (char) 27 + "[0m");
            }
        }

    }

    public void addOption(Car car, Option option) {
        if (car != null && option != null) {
            if (car.getOptions().contains(option)) {
                System.out.println("This option (" + option + ") already added ");
            } else {
                car.getOptions().add(option);
                System.out.println("Option Service: option " + option + " add");
            }
        } else if (option == null && car != null) {
            System.out.println((char) 27 + "[31m" + "There is no option(s). Please, check your information!"
                    + (char) 27 + "[0m");
        } else if (option != null) {
            System.out.println((char) 27 + "[31m" + "This car does not exist. "
                    + "Please, check your information!" + (char) 27 + "[0m");
        } else {
            System.out.println((char) 27 + "[31m" + "There is no option(s) and this car does not exist. "
                    + "Please, check your information!" + (char) 27 + "[0m");
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null & option != null) {
            if (car.getOptions().contains(option)) {
                car.getOptions().remove(option);
                System.out.println("Option Service: option " + option + " delete");
            } else {
                System.out.println("this option " + option + " is not available on this car " + car.getBrand());
            }

        } else if (option == null && car != null) {
            System.out.println((char) 27 + "[31m" + "This option(s) is not exist ("
                    + car.getBrand() + ")" + (char) 27 + "[0m");
        } else if (option != null) {
            System.out.println((char) 27 + "[31m" + "This car does not exist. "
                    + "Please, check your information!" + (char) 27 + "[0m");
        } else {
            System.out.println((char) 27 + "[31m" + "There is no option(s) and this car does not exist. "
                    + "Please, check your information!" + (char) 27 + "[0m");
        }
    }

    public void changeOptions(Car car, Set<Option> options) {
        if (car != null && options != null) {
            car.setOptions(options);
            System.out.println("Option Service: Options changed on: " + options);
        } else if (options == null) {
            System.out.println((char) 27 + "[31m" + "There is no option(s) Please, check your information!" + (char) 27 + "[0m");
        } else {
            System.out.println((char) 27 + "[31m" + "This car does not exist. " +
                    "Please, check your information!" + (char) 27 + "[0m");
        }
    }
}
