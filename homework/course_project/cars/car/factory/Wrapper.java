package homework.course_project.cars.car.factory;

import homework.course_project.cars.car.model.interfaces.Option;

import java.util.HashSet;
import java.util.Set;

public abstract class Wrapper {

    Set<Set<Option>> options;

    public Wrapper(Set<Set<Option>> options) {
        this.options = options;
    }

    public Wrapper() {
        this.options = new HashSet<>();
    }

    public <T> Set<T> getOptions() {
        return (Set<T>) options;
    }

    public void setOptions(Set<Option> option) {
        options.add(option);
    }
}
