package homework.course_project.cars.car.model.enums;

public enum WheelSize {
    WHEEL_14(14),
    WHEEL_15(15),
    WHEEL_16(16),
    WHEEL_17(17),
    WHEEl_18(18);

    private int wheelSize;

    WheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public static int[] valueOf() {
        return new int[0];
    }

}
