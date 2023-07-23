package homework.course_project.cars;

import homework.course_project.cars.audi.Audi;
import homework.course_project.cars.audi.audifactory.AudiFactory;
import homework.course_project.cars.audi.audifactory.WrapperAudi;
import homework.course_project.cars.audi.enums.*;
import homework.course_project.cars.bmw.bmwfactory.BMWFactory;
import homework.course_project.cars.bmw.enums.BMWColor;
import homework.course_project.cars.bmw.enums.BMWModel;
import homework.course_project.cars.bmw.enums.BMWVolumeEng;
import homework.course_project.cars.bmw.enums.BMWWheelSize;
import homework.course_project.cars.ford.enums.FordColor;
import homework.course_project.cars.ford.enums.FordModel;
import homework.course_project.cars.ford.enums.FordVolumeEng;
import homework.course_project.cars.ford.enums.FordWheelSize;
import homework.course_project.cars.ford.fordfactory.FordFactory;
import homework.course_project.cars.services.ChangeColorService;
import homework.course_project.cars.services.ChangeOptionService;
import homework.course_project.cars.services.ChangeWheelService;
import homework.course_project.cars.showroom.ShowroomABF;

import java.util.HashSet;
import java.util.Set;

import static homework.course_project.cars.car.model.Car.printCar;

public class Main {
    public static void main(String[] args) throws NullPointerException {

        try {

            ChangeColorService changeColorService = new ChangeColorService();
            ChangeWheelService changeWheelService = new ChangeWheelService();
            ChangeOptionService changeOptionService = new ChangeOptionService();
            AudiFactory audiFactory = new AudiFactory(
                    AudiColor.values(), AudiModel.values(), AudiWheelSize.values(), AudiVolumeEng.values(), AudiBodyType.values()
            );
            BMWFactory bmwFactory = new BMWFactory(BMWColor.values(), BMWModel.values(), BMWWheelSize.values(), BMWVolumeEng.values());
            FordFactory fordFactory = new FordFactory(FordColor.values(), FordModel.values(), FordWheelSize.values(), FordVolumeEng.values());

            ShowroomABF showroomABF = new ShowroomABF(
                    changeColorService, changeWheelService, changeOptionService, audiFactory, bmwFactory, fordFactory
            );

//        showroomABF.printCarFactoryLists(audiFactory);
//        audiFactory.printStock();

            Audi audi = (Audi) showroomABF.orderCar(
                    AudiBrand.AUDI,
                    BMWColor.BLUE,
                    AudiModel.A5,
                    2023,
                    AudiWheelSize.R17,
                    AudiVolumeEng.V_2_2,
                    new WrapperAudi(AudiBodyType.COUPE, true));


            Set<AudiOption> audiOptions = new HashSet<>();
            audiOptions.add(AudiOption.ARMREST);
            audiOptions.add(AudiOption.CONDITIONER);
            showroomABF.changeOptions(audi, audiOptions);
            printCar(audi);

            Set<AudiOption> audiOptions1 = new HashSet<>();
            audiOptions1.add(AudiOption.POWERWINDOW);
            showroomABF.changeOptions(audi, audiOptions1);
            printCar(audi);

            showroomABF.deleteOption(audi, AudiOption.POWERWINDOW);
            printCar(audi);

            audiFactory.printStock();
        } catch (NullPointerException e){}
    }
}
