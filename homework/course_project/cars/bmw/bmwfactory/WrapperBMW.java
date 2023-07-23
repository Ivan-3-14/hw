package homework.course_project.cars.bmw.bmwfactory;

import homework.course_project.cars.bmw.enums.BMWOption;
import homework.course_project.cars.car.factory.Wrapper;
import homework.course_project.cars.car.model.interfaces.Option;

import java.util.Set;

public class WrapperBMW extends Wrapper {

    private final int maxSpeed;
    Set<BMWOption> bmwOptions;

    public WrapperBMW(Set<BMWOption> bmwOptions, int maxSpeed) {
        this.bmwOptions = bmwOptions;
        this.maxSpeed = maxSpeed;

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public Set<BMWOption> getOptions() {
        return bmwOptions;
    }

    @Override
    public void setOptions(Set<Option> option) {
        super.setOptions(option);
        for (var o : option) {
            bmwOptions.add((BMWOption) o);
        }
    }

    @Override
    public String toString() {
        return
                "options: " + bmwOptions + ", " +
                        "max Speed: " + maxSpeed;
    }
}
