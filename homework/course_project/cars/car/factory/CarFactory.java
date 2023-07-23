package homework.course_project.cars.car.factory;

import homework.course_project.cars.car.model.interfaces.*;
import homework.course_project.cars.car.model.Car;

import static homework.course_project.cars.car.model.Car.printCar;

public abstract class CarFactory {
    private static final int yearOfIssue = 2023;

    private final Color[] color;
    private final Model[] model;
    private final WheelSize[] wheelSize;
    private final VolumeEng[] volumeEng;
    private final Stock stock;

    public CarFactory(Color[] color, Model[] model, WheelSize[] wheelSize, VolumeEng[] volumeEng) {
        this.color = color;
        this.model = model;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
        this.stock = new Stock();
    }

    public void printListForProduction() {
        System.out.println("Available characteristics: ");
        System.out.println("available models: ");
        for (Model m : model) {
            System.out.print(m + ",  ");
        }
        System.out.println();
        System.out.println("available colors: ");
        for (Color c : color) {
            System.out.print(c + ",  ");
        }
        System.out.println();
        System.out.println("available wheelsizes: ");
        for (WheelSize w : getWheelSize()) {
            System.out.print(w + ",  ");
        }
        System.out.println();
        System.out.println("available volumeEng: ");
        for (VolumeEng v : getVolumeEng()) {
            System.out.print(v + ",  ");
        }
        System.out.println();
    }

    public abstract void addCarToStock();

    public void printStock() {
        stock.printStockFromStock();
    }

    public Stock getStock() {
        return stock;
    }

    public Car createCar(Brand brand, Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng,
                         Wrapper wrapper, Stock stock) {
        Car result = stock.findSuitCar(brand, color, model, yearOfIssue, wheelSize, volumeEng, wrapper);

        if (result != null) {
            if (result.getColor() != color) {
                result.setColor(color);
                System.out.println("This car changed color!");
            }
            if (result.getWheelSize() != wheelSize) {
                result.setWheelSize(wheelSize);
                System.out.println("This car changed wheelSize!");
            }
            if (!wrapper.getOptions().equals(result.getOptions())) {
                result.setOptions(wrapper.getOptions());
                System.out.println("This car added (changed) options: ");
                System.out.println(wrapper.getOptions());
            }
            printCar(result);
            System.out.println("-------------------");
            return result;
        }
        Car car = new Car(brand, color, model, yearOfIssue, wheelSize, volumeEng, wrapper) {
        };
        return car;
    }

    public Color[] getColor() {
        return color;
    }

    public Model[] getModel() {
        return model;
    }

    public WheelSize[] getWheelSize() {
        return wheelSize;
    }

    public VolumeEng[] getVolumeEng() {
        return volumeEng;
    }
}






