package homework.three.functional;

import homework.three.car.Car;
import homework.three.lists.Color;
import homework.three.lists.Option;
import homework.three.lists.WheelSize;

import java.util.Set;

public class Service {
    private Car car;
    private Color color;
    private int wheelSizes;

    public Service(Car car, Color color, int wheelSizes, Set<String> option) {
        this.car = car;
        this.color = color;
        this.wheelSizes = wheelSizes;
    }


    public void setColor(String newColor) {
        for (Color c : Color.values()) {
            if (c.name().equals(newColor.toUpperCase())) {
                color = c;
            }
        }
    }

    public void setWheelSize(int newWheelSize) {
        for (int w : WheelSize.valueOf()) {
            if (w == newWheelSize) {
                wheelSizes = w;
            }
        }
    }

    public void setOption(Set<String> option) {
        option.add(String.valueOf(Option.valueOf(option.toString())));
    }


}


//        for (Option opt : options.getOptions()) {
//            if (opt.name().equals(options.name().toUpperCase())) {
//                options = opt;
//            }
//        }
