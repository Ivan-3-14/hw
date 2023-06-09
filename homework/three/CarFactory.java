package homework.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarFactory implements CreateCar {
    private final Color[] color = Color.values();
    private final Model[] model = Model.values();
    private final WheelSize[] wheelSize = WheelSize.values();
    private final VolumeEng[] volumeEng = VolumeEng.values();

    public CarFactory() {
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

    Stock stock = new Stock();
    List<Car> cars =  stock.cars;
    Car myCar1 = new Car(null, null,0,0,0.0);
    Car mod = findSuitCar(Color.GRAY, Model.GEOMETRY, 2020, 18, 1.6, cars);

    private Car findSuitCar(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, List list ) {
        int i = 0;
        for (var mod : cars) {
            if (mod.getModel().equals(model) & mod.getYearOfIssue() == yearOfIssue &
                    mod.getVolumeEng() == volumeEng) {
                if (mod.getColor().equals(color) & mod.getWheelSize() == wheelSize) {
                    System.out.println("This car is in stock: ");
                    System.out.println(mod.toString());
                    i = 1;
                    myCar1 = mod;
                    break;
                } else {
                    if (mod.getColor().equals(color)) {
                        i = 2;
                        myCar1 = mod;
                    }
                    if (mod.getWheelSize() == wheelSize) {
                        i = 3;
                        myCar1 = mod;
                    }
                    if (!mod.getColor().equals(color) & mod.getWheelSize() != wheelSize) {
                        i = 4;
                        myCar1 = mod;
                    }
                }
            }
        }
        switch (i) {
            case 2:
            System.out.println("Car from the stock needs a wheels change at the serviced ");
                System.out.println(myCar1);
            Service service = new Service(myCar1);
            break;

            case 3:
            System.out.println("Car from the stock needs a color change at the serviced ");
            Service service1 = new Service(myCar1);
            System.out.println(myCar1);
            break;

            case 4:
            System.out.println("Car from the stock needs a color and wheels change at the serviced ");
            System.out.println(myCar1);
            break;

            case 0:
            System.out.println("CarFactory will create this car in the near feature ");
            break;
            default:
        }
        return mod;
    }


    @Override
    public Car create(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Option[] options) {
        return null;
    }
}
