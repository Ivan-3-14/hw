package homework.course_project.cars.audi.audifactory;

import homework.course_project.cars.audi.Audi;
import homework.course_project.cars.audi.enums.*;
import homework.course_project.cars.car.factory.CarFactory;
import homework.course_project.cars.car.factory.Stock;


public class AudiFactory extends CarFactory {

    private final Stock audiStock;
    private static AudiBodyType[] bodyType;
    private static final int yearOfIssue = 2023;

    public AudiFactory(AudiColor[] color, AudiModel[] model, AudiWheelSize[] wheelSize, AudiVolumeEng[] volumeEng, AudiBodyType[] bodyType) {
        super(color, model, wheelSize, volumeEng);
        this.audiStock = new Stock();
        AudiFactory.bodyType = bodyType;
        addCarToStock();
    }

    @Override
    public void addCarToStock() {
        this.audiStock.addCarToStock(new Audi(AudiBrand.AUDI, AudiColor.BLACK, AudiModel.A5, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_2, new WrapperAudi(AudiBodyType.COUPE, true)));
        this.audiStock.addCarToStock(new Audi(AudiBrand.AUDI, AudiColor.YELLOW, AudiModel.Q5, 2023, AudiWheelSize.R18, AudiVolumeEng.V_2_0, new WrapperAudi(AudiBodyType.STATION_WAGON, true)));
        this.audiStock.addCarToStock(new Audi(AudiBrand.AUDI, AudiColor.YELLOW, AudiModel.A4, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_2, new WrapperAudi(AudiBodyType.HATCHBACK, true)));
        this.audiStock.addCarToStock(new Audi(AudiBrand.AUDI, AudiColor.RED, AudiModel.A6, 2023, AudiWheelSize.R16, AudiVolumeEng.V_2_4, new WrapperAudi(AudiBodyType.CROSSOWER, true)));
        this.audiStock.addCarToStock(new Audi(AudiBrand.AUDI, AudiColor.RED, AudiModel.A6, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_4, new WrapperAudi(AudiBodyType.SEDAN, true)));
    }

    @Override
    public void printStock() {
        System.out.println("Audi Stock: ");
        audiStock.printStockFromStock();
    }

    @Override
    public void printListForProduction() {
        System.out.print("Audi ");
        super.printListForProduction();
    }

    public Stock getStock() {
        return audiStock;
    }
}
