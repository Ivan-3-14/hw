package homework.three;

public class Service {

    public Service(Car mod) {
    }

    private Car changeCar(Color color, int wheelSize, Option options) {

        for (Color col : color.getColors()) {
            if (col.name().equals(color.name().toUpperCase())) {
                color = col;
            }
        }

//        int w = wheelSize;
//        for ( w : ) {
//            if (w == wheelSize) {
//                wheelSize = w;
//            }
//        }
//        for (Option opt : options.getOptions()) {
//            if (opt.name().equals(options.name().toUpperCase())) {
//                options = opt;
//            }
//        }
        return changeCar(color, wheelSize, options);
    }
}
