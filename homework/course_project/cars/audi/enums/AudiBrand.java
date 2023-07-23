package homework.course_project.cars.audi.enums;

import homework.course_project.cars.car.model.interfaces.Brand;

public enum AudiBrand implements Brand {
    AUDI;

    AudiBrand audiBrand;

    public AudiBrand getBrand() {
        return audiBrand;
    }
}
