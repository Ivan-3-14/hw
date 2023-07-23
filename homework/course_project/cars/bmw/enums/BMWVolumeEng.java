package homework.course_project.cars.bmw.enums;

import homework.course_project.cars.car.model.interfaces.VolumeEng;

public enum BMWVolumeEng  implements VolumeEng {
    V_3_0(3.0d),
    V_4_4(4.4d),
    V_4_8(4.8d);

    private final double bmwVolumeEng;

    BMWVolumeEng(double bmwVolumeEng) { this.bmwVolumeEng = bmwVolumeEng; }
}
