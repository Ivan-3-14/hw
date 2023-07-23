package homework.course_project.cars.car.model;


import homework.course_project.cars.car.factory.Wrapper;
import homework.course_project.cars.car.model.interfaces.*;

import java.util.Set;

public abstract class Car {

    private final Brand brand;
    private Color color;
    private final Model model;
    private final int yearOfIssue;
    private WheelSize wheelSize;
    private final VolumeEng volumeEng;
    private final Wrapper wrapper;


    public Car(Brand brand, Color color, Model model, int yearOfIssue, WheelSize wheelSize, VolumeEng volumeEng, Wrapper wrapper) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
        this.wrapper = wrapper;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public VolumeEng getVolumeEng() {
        return volumeEng;
    }

    public Set<Option> getOptions() {
        return wrapper.getOptions();
    }


    public void setOptions(Set<Option> options) {
        wrapper.setOptions(options);
    }

    public Model getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Brand getBrand() {
        return brand;
    }

    public static void printCar(Car car) {
        System.out.println(car.toString());
    }

    public String toString() {
        return
                brand + " (" +
                        "color: " + color +
                        ", model: " + model +
                        ", yearOfIs: " + yearOfIssue +
                        ", wheelSize: " + wheelSize +
                        ", volumeEng: " + volumeEng +
                        ", " + wrapper +
                        ')';
    }
}
