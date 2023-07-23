package homework.course_project.cars.audi.audifactory;

import homework.course_project.cars.audi.enums.AudiBodyType;
import homework.course_project.cars.audi.enums.AudiOption;
import homework.course_project.cars.car.factory.Wrapper;
import homework.course_project.cars.car.model.interfaces.Option;

import java.util.HashSet;
import java.util.Set;

public class WrapperAudi extends Wrapper {

    private final AudiBodyType bodyType;
    boolean fullSizeSpareWheel;
    Set<AudiOption> audiOptions;

    public WrapperAudi(Set<AudiOption> audiOptions, AudiBodyType bodyType, boolean fullSizeSpareWheel) {
        this.audiOptions = audiOptions;
        this.bodyType = bodyType;
        this.fullSizeSpareWheel = fullSizeSpareWheel;
    }

    public WrapperAudi(AudiBodyType bodyType, boolean fullSizeSpareWheel) {
        this.audiOptions = new HashSet<>();
        this.bodyType = bodyType;
        this.fullSizeSpareWheel = fullSizeSpareWheel;
    }

    public Set<AudiOption> getOptions() {
        return audiOptions;
    }

    @Override
    public void setOptions(Set<Option> option) {
        super.setOptions(option);
        for (var o : option) {
            audiOptions.add((AudiOption) o);
        }
    }

    @Override
    public String toString() {
        return
                "options: " + audiOptions + ", " +
                        "type of body: " + bodyType + ", " +
                        "fullSize spare wheel: " + fullSizeSpareWheel;
    }


}
