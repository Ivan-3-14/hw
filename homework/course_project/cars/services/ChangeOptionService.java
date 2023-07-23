package homework.course_project.cars.services;

import homework.course_project.cars.audi.enums.AudiOption;
import homework.course_project.cars.bmw.enums.BMWOption;
import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.interfaces.Option;
import homework.course_project.cars.car.service.Service;

import homework.course_project.cars.ford.enums.FordOption;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static homework.course_project.cars.utils.Utility.checkBrandHaveThisParameter;

public class ChangeOptionService extends Service {

    @Override
    public void addOption(Car car, Option option) {
        if (checkBrandHaveThisParameter(car, option, List.of(AudiOption.values()), "AUDI")) {
            super.addOption(car, option);
        } else if (checkBrandHaveThisParameter(car, option, List.of(BMWOption.values()), "BMW")) {
            super.addOption(car, option);

        } else if (checkBrandHaveThisParameter(car, option, List.of(FordOption.values()), "FORD")) {
            super.addOption(car, option);
        } else {
            System.out.println((char) 27 + "[31m" + "There is no such option(s) (" + option + ") for this brand ("
                    + car.getBrand() + "). Please, check your information!" + (char) 27 + "[0m");
        }

    }

    @Override
    public void deleteOption(Car car, Option option) {
        super.deleteOption(car, option);
    }

    @Override
    public void changeOptions(Car car, Set<Option> options) {
        if (new HashSet<>(List.of(AudiOption.values())).containsAll(options)) {
            super.changeOptions(car, options);
        } else if (new HashSet<>(List.of(BMWOption.values())).containsAll(options)) {
            super.changeOptions(car, options);

        } else if (new HashSet<>(List.of(FordOption.values())).containsAll(options)) {
            super.changeOptions(car, options);
        } else {
            System.out.println((char) 27 + "[31m" + "There is no such option(s) (" + options + ") for this brand ("
                    + car.getBrand() + "). Please, check your information!" + (char) 27 + "[0m");
        }


    }
}
