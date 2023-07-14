package homework.course_project.cars.car.model;

import homework.course_project.cars.car.model.enums.*;

import java.util.HashSet;
import java.util.Set;

public abstract class Car {

    private Color color;
    private final Model model;
    private final int yearOfIssue;
    private WheelSize wheelSize;
    private VolumeEng volumeEng;
    private Set<Option> options = new HashSet<>();


    public Car( Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Set<Option> options) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
        this.options = options != null ? options : new HashSet<>();
    }

    public void setColor(Color color) { this.color = color; }
    public Color getColor() {
        return color;
    }

    public VolumeEng getVolumeEng() {
        return volumeEng;
    }

    public Set<Option> getOption() {
        return options;
    }
    public void setOption(Set<Option> options) {
        this.options = options;
    }

    public Model getModel() {
        return model;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }
    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public abstract void printCar(Car car);

    @Override
    public String toString() {
        return
                " (" +
                "color: " + color +
                ", model: " + model +
                ", yearOfIssue: " + yearOfIssue +
                ", wheelSize: " + wheelSize +
                ", volumeEng: " + volumeEng +
                ", options: " + options +
                ',';
    }
}
