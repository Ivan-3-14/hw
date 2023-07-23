package homework.course_project.cars.car.factory;

import homework.course_project.cars.car.model.interfaces.*;
import homework.course_project.cars.car.model.Car;


import java.util.ArrayList;
import java.util.List;

import static homework.course_project.cars.car.model.Car.printCar;

public class Stock {

    private final List<Car> cars = new ArrayList<>();

    public void addCarToStock(Car car) {
        cars.add(car);
    }

    public void printStockFromStock() {
        for (var s : cars) {
            printCar(s);
        }
    }

    public Car findSuitCar(Brand brand, Color color, Model model, int yearOfIssue, WheelSize wheelSize,
                           VolumeEng volumeEng, Wrapper wrapper) throws NullPointerException {
        synchronized (cars) {
            Car suitCar = null;
            int count = 0;

            for (var mod : cars) {
                if (mod.getModel().equals(model) & mod.getVolumeEng().equals(volumeEng) & mod.getYearOfIssue() == yearOfIssue) {
                    if (mod.getColor().equals(color) & mod.getWheelSize().equals(wheelSize) & wrapper.getOptions().equals(mod.getOptions())) {
                        System.out.println("This car is in stock: ");
                        count = 1;
                        suitCar = mod;
                        cars.remove(suitCar);
                        break;
                    } else {
                        if (mod.getColor().equals(color)) {
                            count = 2;
                            suitCar = mod;
                        }
                        if (mod.getWheelSize().equals(wheelSize)) {
                            count = 3;
                            suitCar = mod;
                        }
                        if (!mod.getColor().equals(color) & !mod.getWheelSize().equals(wheelSize)) {
                            count = 4;
                            suitCar = mod;
                        }
                        if (!wrapper.getOptions().equals(mod.getOptions())) {
                            count = 5;
                            suitCar = mod;
                        }
                    }
                }
            }
            switch (count) {
                case 2:
                    System.out.println("Car from the stock needs a wheels change ");
                    System.out.println("in stock: ");
                    printCar(suitCar);
                    cars.remove(suitCar);
                    break;

                case 3:
                    System.out.println("Car from the stock needs a color change ");
                    System.out.println("in stock: ");
                    printCar(suitCar);
                    cars.remove(suitCar);
                    break;

                case 4:
                    System.out.println("Car from the stock needs a color and wheels change ");
                    System.out.println("in stock: ");
                    printCar(suitCar);
                    cars.remove(suitCar);
                    break;
                case 5:
                    System.out.println("Car from the stock needs a option change ");
                    System.out.println("in stock: ");
                    printCar(suitCar);
                    cars.remove(suitCar);
                    break;

                case 0:
                    System.out.println("CarFactory will create this car in the near feature ");
                    break;
                default:
            }
            return suitCar;
        }
    }
}

