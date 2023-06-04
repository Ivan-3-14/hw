package homework.three;

public interface CreateCar {

    Car create(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng, Options options);

    Car create(Color color, Model model, int yearOfIssue, int wheelSize, double volumeEng);

}
