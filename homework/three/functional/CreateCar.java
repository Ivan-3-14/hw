package homework.three.functional;

import homework.three.lists.Color;
import homework.three.lists.Model;

import java.util.Set;

public interface CreateCar {

    Car create (Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Set<String> options);
}
