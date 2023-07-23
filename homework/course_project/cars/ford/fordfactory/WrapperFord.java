package homework.course_project.cars.ford.fordfactory;

import homework.course_project.cars.car.factory.Wrapper;
import homework.course_project.cars.car.model.interfaces.Option;
import homework.course_project.cars.ford.enums.FordOption;

import java.util.Set;


public class WrapperFord extends Wrapper {

    Set<FordOption> fordOptions;

    public WrapperFord(Set<FordOption> fordOptions) {
        this.fordOptions = fordOptions;
    }

    public Set<FordOption> getOptions() {
        return fordOptions;
    }

    @Override
    public void setOptions(Set<Option> option) {
        super.setOptions(option);
        for (var o : option) {
            fordOptions.add((FordOption) o);
        }
    }

    @Override
    public String toString() {
        return "options: " + fordOptions;
    }
}
