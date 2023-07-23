package homework.course_project.cars.ford.enums;

import homework.course_project.cars.car.model.interfaces.VolumeEng;

public enum FordVolumeEng implements VolumeEng {
    V_1_4(1.4d),
    V_1_6(1.6d),
    V_1_8(1.8d);

    private double fordVolumeEng;

    FordVolumeEng(double fordVolumeEng) {
        this.fordVolumeEng = fordVolumeEng;
    }
}
