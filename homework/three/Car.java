package homework.three;

public class Car {

    protected Color color;
    private Model model;
    private int yearOfIssue;
    protected int wheelSize;
    private double volumeEng;
    public Options options;


    public Car(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Options options) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheelSize = wheelSize;
        this.volumeEng = volumeEng;
        this.options = options;
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

    public void setOptions(Options options) {
        this.options = options;
    }

    public Color getColor() {
        return color;
    }

    public double getVolumeEng() {
        return volumeEng;
    }

    public Options getOptions() {
        return options;
    }


    @Override
    public String toString() {
        return "myCar { " +
                "color = " + color +
                ", model = " + model +
                ", yearOfIssue = " + yearOfIssue +
                ", wheelSize = " + wheelSize +
                ", volumeEng = " + volumeEng +
                ", options = " + options +
                '}';
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
