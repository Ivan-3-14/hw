package homework.course_project.cars.car.factory;
import homework.course_project.cars.car.model.enums.*;
import homework.course_project.cars.car.model.Car;

import java.util.Set;

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
    };

    public void printStock() {
        stock.printStockFromStock();
    }

    public Car createCar(Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Set<Option> options) {
        Car result = stock.findSuitCar(color, model, yearOfIssue, wheelSize, volumeEng, options);

        if (result != null) {
            if (result.getColor() != color) {
                result.setColor(color);
            }
            if (result.getWheelSize() != wheelSize) {
                result.setWheelSize(wheelSize);
            }
            result.setOption(options);
            return result;
        }
        return new Car(color, model, yearOfIssue, wheelSize, volumeEng, options) {
            @Override
            public void printCar(Car car) {

            }
        };
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






