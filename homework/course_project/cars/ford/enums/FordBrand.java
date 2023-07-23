package homework.course_project.cars.ford.enums;

import homework.course_project.cars.car.model.interfaces.Brand;

public enum FordBrand implements Brand {
    FORD;

    FordBrand fordBrand;

    public FordBrand getBrand() {
        return fordBrand;
    }
}
