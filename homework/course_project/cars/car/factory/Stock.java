package homework.course_project.cars.car.factory;

import homework.course_project.cars.audi.Audi;
import homework.course_project.cars.audi.enums.*;
import homework.course_project.cars.bmw.BMW;
import homework.course_project.cars.bmw.enums.BMWColor;
import homework.course_project.cars.bmw.enums.BMWModel;
import homework.course_project.cars.bmw.enums.BMWVolumeEng;
import homework.course_project.cars.bmw.enums.BMWWheelSize;
import homework.course_project.cars.car.model.enums.*;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.ford.Ford;
import homework.course_project.cars.ford.enums.FordColor;
import homework.course_project.cars.ford.enums.FordModel;
import homework.course_project.cars.ford.enums.FordVolumeEng;
import homework.course_project.cars.ford.enums.FordWheelSize;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Stock {

    protected List<Car> cars = new ArrayList<>();

    public Stock() {}

    public void addCarToAudiStorage() {
        cars.add(new Audi(AudiColor.BLACK, AudiModel.A5, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_2, null, AudiBodyType.COUPE));
        cars.add(new Audi(AudiColor.YELLOW, AudiModel.Q5, 2023, AudiWheelSize.R18, AudiVolumeEng.V_2_0, null, AudiBodyType.STATION_WAGON));
        cars.add(new Audi(AudiColor.YELLOW, AudiModel.A4, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_2, null, AudiBodyType.HATCHBACK));
        cars.add(new Audi(AudiColor.RED, AudiModel.A6, 2023, AudiWheelSize.R16, AudiVolumeEng.V_2_4, null, AudiBodyType.CROSSOWER));
        cars.add(new Audi(AudiColor.RED, AudiModel.A6, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_4, null, AudiBodyType.SEDAN));
    }

    public void addCarToBMWStorage() {
        cars.add(new BMW( BMWColor.WHITE, BMWModel.X1, 2023, BMWWheelSize.R19, BMWVolumeEng.V_3_0,null));
        cars.add(new BMW( BMWColor.GRAY, BMWModel.X2, 2023, BMWWheelSize.R20,BMWVolumeEng.V_4_4,null));
        cars.add(new BMW( BMWColor.BLUE, BMWModel.X3, 2023, BMWWheelSize.R21,BMWVolumeEng.V_4_8,null));
        cars.add(new BMW( BMWColor.GRAY, BMWModel.X5, 2023, BMWWheelSize.R21,BMWVolumeEng.V_4_4,null));
        cars.add(new BMW( BMWColor.WHITE, BMWModel.X6, 2023, BMWWheelSize.R20,BMWVolumeEng.V_4_4,null));
    }

    public void addCarToFordStorage() {
        cars.add(new Ford(FordColor.GREEN, FordModel.FIESTA, 2023, FordWheelSize.R13, FordVolumeEng.V_1_4,null));
        cars.add(new Ford(FordColor.VIOLET, FordModel.FOCUS, 2023,FordWheelSize.R14,FordVolumeEng.V_1_6,null));
        cars.add(new Ford(FordColor.ORANGE, FordModel.MONDEO, 2023,FordWheelSize.R15,FordVolumeEng.V_1_8,null));
        cars.add(new Ford(FordColor.ORANGE, FordModel.MUSTANG, 2023,FordWheelSize.R15,FordVolumeEng.V_1_8,null));
    }

    public  void  printStockFromStock() {
        for (var s : cars) {
            s.printCar(s);
        }
    }

    public Car findSuitCar(Color color, Model model, int yearOfIssue, WheelSize wheelSize,
                           VolumeEng volumeEng, Set<Option> option) {
        Car suitCar = null;
        int count = 0;

        System.out.println("poisk ");

        for (var mod : cars) {
            System.out.println("wait");
            if (mod.getModel().equals(model) & mod.getVolumeEng().equals(volumeEng)) {
                if (mod.getColor().equals(color) & mod.getWheelSize().equals(wheelSize) ) {
                    System.out.println("This car is in stock: ");
                    count = 1;
                    suitCar = mod;
                    System.out.println("in stock: " + suitCar);
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
                }
            }
        }
        System.out.println("tut");
        switch (count) {
            case 2:
                System.out.println("Car from the stock needs a wheels change at the serviced ");
                System.out.println("in stock: " + suitCar);
                cars.remove(suitCar);
                break;

            case 3:
                System.out.println("Car from the stock needs a color change at the serviced ");
                System.out.println("in stock: " + suitCar);
                cars.remove(suitCar);
                break;

            case 4:
                System.out.println("Car from the stock needs a color and wheels change at the serviced ");
                System.out.println("in stock: " + suitCar);
                cars.remove(suitCar);
                break;

            case 0:
                System.out.println("CarFactory will create this car in the near feature ");
                break;
            default:
        }
        return suitCar;
    }

    @Override
    public String toString() {
        return "Stock{}";
    }


}
