package homework.three;

import java.util.Arrays;
import java.util.Set;

public class Car {

    private  Color color;
    private final Model model;
    private final int yearOfIssue;
    private  int wheelSize;
    private final double volumeEng;
    private Option option;


    public Car(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Option options) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
        this.option = options;
    }

    public Car(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Color getColor() {
        return color;
    }

    public double getVolumeEng() {
        return volumeEng;
    }

    public Option getOptions() {
        return option;
    }


    @Override
    public String toString() {
        return "myCar ( " +
                "color = " + color +
                ", model = " + model +
                ", yearOfIssue = " + yearOfIssue +
                ", wheelSize = " + wheelSize +
                ", volumeEng = " + volumeEng +
                "," + option +
                ')';
    }

    public Model getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getWheelSize() {
        return wheelSize;
    }
}
