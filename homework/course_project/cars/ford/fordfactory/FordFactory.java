package homework.course_project.cars.ford.fordfactory;


import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.factory.Stock;
import homework.course_project.cars.car.model.interfaces.*;
import homework.course_project.cars.ford.Ford;
import homework.course_project.cars.ford.enums.*;

public class FordFactory extends CarFactory {

    private final Stock fordStock;
    private static final int yearOfIssue = 2023;

    public FordFactory(Color[] color, Model[] model, WheelSize[] wheelSize, VolumeEng[] volumeEng) {
        super(color, model, wheelSize, volumeEng);
        this.fordStock = new Stock();
        addCarToStock();
    }

    @Override
    public void addCarToStock() {
        this.fordStock.addCarToStock(new Ford(FordBrand.FORD, FordColor.GREEN, FordModel.FIESTA, 2023, FordWheelSize.R13, FordVolumeEng.V_1_4, new WrapperFord(null)));
        this.fordStock.addCarToStock(new Ford(FordBrand.FORD, FordColor.VIOLET, FordModel.FOCUS, 2023, FordWheelSize.R14, FordVolumeEng.V_1_6, new WrapperFord(null)));
        this.fordStock.addCarToStock(new Ford(FordBrand.FORD, FordColor.ORANGE, FordModel.MONDEO, 2023, FordWheelSize.R15, FordVolumeEng.V_1_8, new WrapperFord(null)));
        this.fordStock.addCarToStock(new Ford(FordBrand.FORD, FordColor.ORANGE, FordModel.MUSTANG, 2023, FordWheelSize.R15, FordVolumeEng.V_1_8, new WrapperFord(null)));
    }

    @Override
    public void printStock() {
        System.out.println("Ford Stock: ");
        fordStock.printStockFromStock();
    }

    @Override
    public void printListForProduction() {
        System.out.print("Ford ");
        super.printListForProduction();
    }

    public Stock getStock() {
        return fordStock;
    }
}
