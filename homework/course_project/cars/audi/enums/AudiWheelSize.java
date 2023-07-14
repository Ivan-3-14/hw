package homework.course_project.cars.audi.enums;

import homework.course_project.cars.car.model.enums.WheelSize;

public enum AudiWheelSize implements WheelSize {
    R16(16),
    R17(17),
    R18(18);

    private int audiWheelSize;

    AudiWheelSize(int audiWheelSize) {
        this.audiWheelSize = audiWheelSize;
    }

    public static int[] valueOf() {
        return new int[0];
    }

}
