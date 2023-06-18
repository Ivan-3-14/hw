package homework.three.lists;

public enum WheelSize {
    WHEEL_14(14),
    WHEEL_15(15),
    WHEEL_16(16),
    WHEEL_17(17),
    WHEEl_18(18);

    private WheelSize[] wheelSizes;
    private int wheelSize;

    WheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public static int[] valueOf() {
        return new int[0];
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize[] wheelSize) {
    }
}
