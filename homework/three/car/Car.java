package homework.three.car;
import homework.three.lists.Color;
import homework.three.lists.Model;

import java.util.HashSet;
import java.util.Set;

public class Car {

    private Color colors;
    private final Model model;
    private final int yearOfIssue;
    private  int wheelSize;
    private final double volumeEng;
    Set<String> option = new HashSet<>();


    public Car(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Set<String> option) {
        this.colors = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
        this.option = option;
    }

    public Car(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng) {
        this.colors = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
    }

    public void setColor(Color color) {
        this.colors = color;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Color getColor() {
        return colors;
    }

    public double getVolumeEng() {
        return volumeEng;
    }

    public Set<String> getOption() { return option;}

    public void setOption(Set<String> option) { this.option = option; }

    public Model getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    @Override
    public String toString() {
        return "Car (" +
                "color: " + colors +
                ", model: " + model +
                ", yearOfIssue: " + yearOfIssue +
                ", wheelSize: " + wheelSize +
                ", volumeEng: " + volumeEng +
                ", options: " + option +
                ')';
    }
}
