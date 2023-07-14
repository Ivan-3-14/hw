package homework.course_project.cars.car;

import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.*;
import homework.course_project.cars.car.service.Service;
import homework.course_project.cars.car.showroom.Showroom;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
//        CarFactory factory = new CarFactory(Brand.values(), Color.values(), Model.values(), WheelSize.values(), VolumeEng.values());
//        Showroom showroom = new Showroom(service, factory);

//        showroom.printCarFactoryLists();

        Set<Option> options = new HashSet<>();


//        System.out.println();
//        Car newCar = showroom.orderCar(Color.GREEN, Model.GEOMETRY, 2023, 14, 1.8, options);
//        System.out.println();
//        System.out.println("Order car:");
//        System.out.println(newCar);
//        System.out.println();
//       factory.printStock();

    }
}
