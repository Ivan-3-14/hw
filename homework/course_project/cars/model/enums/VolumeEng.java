package homework.three.lists;

public enum VolumeEng {
    ENG_1_4(1.4d),
    ENG_1_6(1.6d),
    ENG_1_8(1.8d),
    ENG_2_0(2.0d);

    private double volumeEng;

    VolumeEng(double volumeEnge) {
        this.volumeEng = volumeEng;
    }

    public double getVolumeEng() {
        return volumeEng;
    }
}
