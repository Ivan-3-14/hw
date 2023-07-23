package homework.course_project.cars.utils;

import homework.course_project.cars.car.model.Car;

import java.util.List;

public class Utility {

    public static boolean checkBrandHaveThisParameter(Car car, Object object, List<Object> list, String string) {
        boolean result = false;
        if (car.getBrand().toString().equalsIgnoreCase(string)
                && checkRequiredParameter(list, object)) {
            result = true;
        }
        return result;
    }

    public static boolean checkRequiredParameter(List<Object> list, Object object) {
        boolean result = false;
        for (var lists : list) {
            if (lists.equals(object)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
