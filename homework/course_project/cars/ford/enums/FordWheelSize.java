package homework.course_project.cars.ford.enums;

import homework.course_project.cars.car.model.enums.WheelSize;

public enum FordWheelSize implements WheelSize {
    R13(13),
    R14(14),
    R15(15);

    private int fordWheelSize;

    FordWheelSize(int fordWheelSize) {
        this.fordWheelSize = fordWheelSize;
    }

    public static int[] valueOf() {
        return new int[0];
    }
}
