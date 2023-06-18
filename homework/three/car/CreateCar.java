package homework.three.car;

import homework.course_project.cars.model.enums.Color;
import homework.course_project.cars.model.enums.Model;

import java.util.Set;

public interface CreateCar {

    Car create(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Set<String> options);
}
