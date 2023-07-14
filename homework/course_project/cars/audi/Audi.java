package homework.course_project.cars.audi;

import homework.course_project.cars.audi.enums.*;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.Option;

import java.util.Set;


public class Audi extends Car {

    private static AudiBodyType bodyType;

    public Audi(AudiColor audiColor, AudiModel audiModel, int yearOfIssue, AudiWheelSize wheelSize, AudiVolumeEng volumeEng,
                Set<Option> audiOptions, AudiBodyType bodyType)
    {
        super(audiColor, audiModel, yearOfIssue, wheelSize, volumeEng, audiOptions);
        this.bodyType = bodyType;
    }

    public AudiBodyType getBodyType() {
        return bodyType;
    }


    @Override
    public void printCar(Car car) {
        System.out.println("Audi" + car + " bodyType: " + bodyType + ')');
    }


}

