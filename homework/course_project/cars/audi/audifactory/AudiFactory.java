package homework.course_project.cars.audi.audifactory;

import homework.course_project.cars.audi.enums.*;
import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.factory.Stock;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.*;

import java.util.Set;


public class AudiFactory extends CarFactory {

    private final Stock audiStock;
    private static AudiBodyType[] bodyType;
    private static final int yearOfIssue = 2023;

    public AudiFactory(AudiColor[] color, AudiModel[] model, AudiWheelSize[] wheelSize, AudiVolumeEng[] volumeEng, AudiBodyType[] bodyType) {
        super(color, model, wheelSize, volumeEng);
        this.audiStock = new Stock();
        this.bodyType = bodyType;
        audiStock.addCarToAudiStorage();
    }

    @Override
    public void printStock() {
        System.out.println("Audi Stock: ");
        audiStock.printStockFromStock();
    }

    @Override
    public void printListForProduction() {
        System.out.println("Available characteristics: ");
        super.printListForProduction();
    }

    @Override
    public Car createCar(Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Set<Option> options) {
        return super.createCar(color, model, yearOfIssue, wheelSize, volumeEng, options);
    }
}
