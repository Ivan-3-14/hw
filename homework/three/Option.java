package homework.three;

import java.util.HashSet;
import java.util.Set;

public class Option {

    Set<String> options = new HashSet<>();

    public Option() {
        options.add("Conditioner");
        options.add("PowerWindow");
        options.add("ESPsystem");
        options.add("ABSsystem");
        options.add("ParkingSensor");
        options.add("Signaling");
        options.add("ArmRest");
    }

    @Override
    public String toString() {
        return "options:" + options;
    }
}
