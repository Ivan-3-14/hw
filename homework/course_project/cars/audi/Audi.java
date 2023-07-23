package homework.course_project.cars.audi;

import homework.course_project.cars.audi.audifactory.WrapperAudi;
import homework.course_project.cars.audi.enums.*;
import homework.course_project.cars.car.model.Car;


public class Audi extends Car {

    public Audi(AudiBrand audiBrand, AudiColor audiColor, AudiModel audiModel, int yearOfIssue, AudiWheelSize wheelSize,
                AudiVolumeEng volumeEng, WrapperAudi wrapperAudi) {
        super(audiBrand, audiColor, audiModel, yearOfIssue, wheelSize, volumeEng, wrapperAudi);
    }
}

