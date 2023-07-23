package homework.course_project.cars.bmw.enums;

import homework.course_project.cars.car.model.interfaces.Brand;

public enum BMWBrand implements Brand {
    BMW;

    BMWBrand bmwBrand;

    public BMWBrand getBrand() {
        return bmwBrand;
    }
}
