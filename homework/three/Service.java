package homework.three;

public class Service {

    private final Color[] color = Color.values();
    private final WheelSize[] wheelSize = WheelSize.values();
    private final Options[] options = Options.values();

    public Service() {
    }


    private Service (Color color, int wheelSize, Options options) {

        for (Color col : color.getColors()) {
            if (col.name().equals(color.name().toUpperCase())) {
                color = col;
            }
        }

//        for ( var w : wheelSize) {
//            if (w == wheelSize) {
//                wheelSize = w;
//            }
//        }
        for (Options opt : options.getOptions()) {
            if (opt.name().equals(options.name().toUpperCase())) {
                options = opt;
            }
        }
    }
}
