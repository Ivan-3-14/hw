package homework.course_project.cars.bmw.enums;

import homework.course_project.cars.car.model.interfaces.WheelSize;

public enum BMWWheelSize implements WheelSize {
    R19(19),
    R20(20),
    R21(21);

    private int bmwWheelSize;

    BMWWheelSize(int bmwWheelSize) {
        this.bmwWheelSize = bmwWheelSize;
    }

    public static int[] valueOf() {
        return new int[0];
    }

}
