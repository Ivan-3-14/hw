package homework.course_project.cars.audi.enums;

import homework.course_project.cars.car.model.enums.VolumeEng;

public enum AudiVolumeEng implements VolumeEng {
    V_2_0(2.0d),
    V_2_2(2.2d),
    V_2_4(2.4d);

    private final double audiVolumeEng;

    AudiVolumeEng(double audiVolumeEng) { this.audiVolumeEng = audiVolumeEng; }
}
