package homework.three.functional;

import homework.three.car.Car;
import homework.three.car.CreateCar;
import homework.course_project.cars.model.enums.Color;
import homework.course_project.cars.model.enums.Model;
import homework.course_project.cars.model.enums.VolumeEng;
import homework.course_project.cars.model.enums.WheelSize;

import java.util.List;
import java.util.Set;

public class CarFactory implements CreateCar {
    private final Color[] color = Color.values();
    private final Model[] model = Model.values();
    private final WheelSize[] wheelSize = WheelSize.values();
    private final VolumeEng[] volumeEng = VolumeEng.values();
    private Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public void printListForProduction() {
        System.out.println("available models: ");
        for (Model m : model) {
            System.out.print(m + "  ");
        }
        System.out.println();
        System.out.println("available colors: ");
        for (Color c : color) {
            System.out.print(c + "  ");
        }
        System.out.println();
        System.out.println("available wheelsizes: ");
        for (WheelSize w : wheelSize) {
            System.out.print(w + "  ");
        }
        System.out.println();
        System.out.println("available volumeEng: ");
        for (VolumeEng v : volumeEng) {
            System.out.print(v + "  ");
        }
    }

    Car myCar1 = new Car(null, null, 0, 0, 0.0);
    int i = 0;

    public CarFactory findSuitCar(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Set<String> option, List<Car> cars) {
        Color myColor = color;
        int myWheelSize = wheelSize;

        for (var mod : cars) {
            if (mod.getModel().equals(model) & mod.getYearOfIssue() == yearOfIssue &
                    mod.getVolumeEng() == volumeEng) {
                if (mod.getColor().equals(color) & mod.getWheelSize() == wheelSize) {
                    System.out.println("This car is in stock: ");
                    i = 1;
                    myCar1 = mod;
                    Service options = new Service(myCar1, myColor, myWheelSize, option);
                    myCar1.setOption(option);
                    System.out.println(myCar1);
                    break;
                } else {
                    if (mod.getColor().equals(color)) {
                        i = 2;
                        myCar1 = mod;
                    }
                    if (mod.getWheelSize() == wheelSize) {
                        i = 3;
                        myCar1 = mod;
                    }
                    if (!mod.getColor().equals(color) & mod.getWheelSize() != wheelSize) {
                        i = 4;
                        myCar1 = mod;
                    }
                }
            }
        }
        switch (i) {
            case 2:
                System.out.println("Car from the stock needs a wheels change at the serviced ");

                Service wheelChange = new Service(myCar1, myColor, myWheelSize, option);
                wheelChange.setWheelSize(myWheelSize);
                myCar1.setWheelSize(myWheelSize);
                myCar1.setOption(option);
                System.out.println(myCar1);
                break;

            case 3:
                System.out.println("Car from the stock needs a color change at the serviced ");

                Service colorChange = new Service(myCar1, myColor, myWheelSize, option);
                colorChange.setColor(String.valueOf(myColor));
                myCar1.setColor(myColor);
                myCar1.setOption(option);
                System.out.println(myCar1);
                break;

            case 4:
                System.out.println("Car from the stock needs a color and wheels change at the serviced ");

                Service colorChangeAndWheelSize = new Service(myCar1, myColor, myWheelSize, option);
                colorChangeAndWheelSize.setColor(String.valueOf(myColor));
                myCar1.setColor(myColor);
                colorChangeAndWheelSize.setWheelSize(myWheelSize);
                myCar1.setWheelSize(myWheelSize);
                myCar1.setOption(option);
                System.out.println(myCar1);
                break;

            case 0:
                System.out.println("CarFactory will create this car in the near feature ");
                break;
            default:
        }
        return null;
    }

    @Override
    public Car create(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Set<String> options) {
        Car result = null;
        if (i == 0) {
            color = color;
            model = model;
            yearOfIssue = yearOfIssue;
            wheelSize = wheelSize;
            volumeEng = volumeEng;
            options = options;
            result = new Car(color, model, yearOfIssue, wheelSize, volumeEng, options);
            System.out.println("created car: " + result);
        }
        return result;
    }
}
