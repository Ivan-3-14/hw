package homework.three;

public class CarFactory implements CreateCar {
    private final Color[] color = Color.values();
    private final Model[] model = Model.values();
    private final WheelSize[] wheelSize = WheelSize.values();
    private final VolumeEng[] volumeEng = VolumeEng.values();

    public CarFactory() {
    }

    Car[] stock = {
            new Car (Color.GREEN, Model.GEOMETRY, 2020, 15, 1.6),
            new Car(Color.BlUE, Model.ATLAS, 2020, 16, 1.6),
            new Car(Color.YELLOW, Model.TUGELLA, 2023, 17, 1.6),
            new Car(Color.BLACK, Model.EMGRAND, 2020, 14, 1.4),
            new Car(Color.GRAY, Model.COOLRAY, 2023, 17, 2.0),
            new Car(Color.VIOLET, Model.GEOMETRY, 2020, 15, 1.6),
            new Car(Color.GREEN, Model.OKVANGO, 2020, 16, 1.6)
    };

    public void printStock() {
        for (var s : stock) {
            System.out.print(s + "\n");
        }
    }

    public void printListForProduction() {
        System.out.println("available models: ");
        for (Model m : model) {
            System.out.print(m + "  ");
        }
        System.out.println();
        System.out.println("available colors: ");
        for (Color c : color) {
            System.out.print(c + "  ");
        }
        System.out.println();
        System.out.println("available wheelsizes: ");
        for (WheelSize w : wheelSize) {
            System.out.print(w + "  ");
        }
        System.out.println();
        System.out.println("available volumeEng: ");
        for (VolumeEng v : volumeEng) {
            System.out.print(v + "  ");
        }
    }


    Car mod = findSuitCar(Color.GRAY, Model.OKVANGO, 2020, 16, 1.6,stock);

    private Car findSuitCar(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Car[] stock) {
        int i = 0;
        Car m = null;
        for (var mod : stock) {
            if (mod.getModel().equals(model) & mod.getYearOfIssue() == yearOfIssue  &
                    mod.getVolumeEng() == volumeEng) {
                if (mod.getColor().equals(color) & mod.getWheelSize() == wheelSize) {
                    i = 1;
                    System.out.println("This car is in stock: ");
                    System.out.println(mod);
                    break;
                }
                else {
                    i = 2;
                   m = mod;
                }
            } else {
                i = 3;
            }
        }
        if (i == 2) {

            System.out.println("Car from the stock needs to be serviced ");
            System.out.println(m);
        }
        else if (i == 3 ){
            System.out.println("CarFactory will create this car in the near feature ");
        }
        return mod;
    }


    @Override
    public Car create(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Options options) {
        return null;
    }

    @Override
    public Car create(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng) {
        return null;
    }


}
