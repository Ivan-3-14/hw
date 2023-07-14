package homework.course_project.cars.services;

import homework.course_project.cars.car.model.Car;
import homework.course_project.cars.car.model.enums.Option;
import homework.course_project.cars.car.service.Service;

import java.util.Set;

public class ChangeOptionService extends Service {

    @Override
    public void addOption(Car car, Option option) {
        super.addOption(car, option);
    }

    @Override
    public void deleteOption(Car car, Option option) {
        super.deleteOption(car, option);
    }

    @Override
    public void setOptions(Car car, Set<Option> options) {
        super.setOptions(car, options);
    }
}
