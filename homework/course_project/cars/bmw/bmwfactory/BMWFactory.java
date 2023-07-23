package homework.course_project.cars.bmw.bmwfactory;

import homework.course_project.cars.bmw.BMW;
import homework.course_project.cars.bmw.enums.*;
import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.factory.Stock;
import homework.course_project.cars.car.model.interfaces.*;


public class BMWFactory extends CarFactory {

    private final Stock bmwStock;
    private static final int yearOfIssue = 2023;

    public BMWFactory(Color[] color, Model[] model, WheelSize[] wheelSize, VolumeEng[] volumeEng) {
        super(color, model, wheelSize, volumeEng);
        this.bmwStock = new Stock();
        addCarToStock();
    }

    @Override
    public void addCarToStock() {
        this.bmwStock.addCarToStock(new BMW(BMWBrand.BMW, BMWColor.WHITE, BMWModel.X1, 2023, BMWWheelSize.R19, BMWVolumeEng.V_3_0, new WrapperBMW(null, 230)));
        this.bmwStock.addCarToStock(new BMW(BMWBrand.BMW, BMWColor.GRAY, BMWModel.X2, 2023, BMWWheelSize.R20, BMWVolumeEng.V_4_4, new WrapperBMW(null, 220)));
        this.bmwStock.addCarToStock(new BMW(BMWBrand.BMW, BMWColor.BLUE, BMWModel.X3, 2023, BMWWheelSize.R21, BMWVolumeEng.V_4_8, new WrapperBMW(null, 210)));
        this.bmwStock.addCarToStock(new BMW(BMWBrand.BMW, BMWColor.GRAY, BMWModel.X5, 2023, BMWWheelSize.R21, BMWVolumeEng.V_4_4, new WrapperBMW(null, 220)));
        this.bmwStock.addCarToStock(new BMW(BMWBrand.BMW, BMWColor.WHITE, BMWModel.X6, 2023, BMWWheelSize.R20, BMWVolumeEng.V_4_4, new WrapperBMW(null, 210)));
    }

    @Override
    public void printStock() {
        System.out.println("BMW Stock: ");
        bmwStock.printStockFromStock();
    }

    @Override
    public void printListForProduction() {
        System.out.print("BMW ");
        super.printListForProduction();
    }

    public Stock getStock() {
        return bmwStock;
    }
}
