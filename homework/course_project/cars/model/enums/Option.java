package homework.three.lists;

import java.util.Arrays;

public enum Option {
    CONDITIONER,
    POWERWINDOW,
    ESPSYSTEM,
    ABSSYSTEM,
    PARKINGSENSOR,
    SIGNALING,
    ARMREST;

    private Option[] options;

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return Arrays.toString(options);
    }
}
