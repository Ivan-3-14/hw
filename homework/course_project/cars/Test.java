package homework.course_project.cars;

import homework.course_project.cars.audi.Audi;
import homework.course_project.cars.audi.audifactory.AudiFactory;
import homework.course_project.cars.audi.enums.*;
import homework.course_project.cars.bmw.BMW;
import homework.course_project.cars.bmw.enums.*;
import homework.course_project.cars.car.model.enums.*;

import java.util.HashSet;
import java.util.Set;


public class Test {
    public static void main(String[] args) {

        Audi audi = new Audi(AudiColor.BLACK,  AudiModel.A5, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_2,null, AudiBodyType.HATCHBACK);
//       вывести на печать заданную машину
//       audi.printCar(audi); System.out.println("--------");

//      создаём опции для БМВ
        Set<Option> bmwOptions = new HashSet<>();
        bmwOptions.add(BMWOption.PARKINGSENSOR);
        bmwOptions.add(BMWOption.SIGNALING);

        BMW bmw = new BMW(BMWColor.WHITE, BMWModel.X1, 2023, BMWWheelSize.R19, BMWVolumeEng.V_3_0, bmwOptions);
//        вывести на печать заданную машину с опциями
//        bmw.printCar(bmw); System.out.println("--------");

//      создаем завод для ауди
        AudiFactory audiFactory = new AudiFactory(AudiColor.values(), AudiModel.values(), AudiWheelSize.values(), AudiVolumeEng.values(), AudiBodyType.values());

//      выводим все возможные для ауди цвета, модели и размеры колёс и двигателей на печать
//        audiFactory.printListForProduction(); System.out.println(); System.out.println("--------");

//      выводим на печать склад ауди
//        audiFactory.printStock();

        audiFactory.createCar(AudiColor.BLACK, AudiModel.A5, 2023, AudiWheelSize.R17, AudiVolumeEng.V_2_2, null);






    }
}
