package task;

public class Homework1 {
    public static void main(String[] args) {
        int sideA = 25;
        int sideB = 19;
        int sideC = 40;
        int sideD = 31;
        int sideE = 50;
        int sideF = 40;

        if (sideB + sideD <= sideF & sideA <= sideE & sideC <= sideE) {
            System.out.println("дома помещаются");
        } else if (sideB + sideD <= sideE & sideA <= sideF & sideC <= sideF) {
            System.out.println("дома помещаются");
        } else if (sideA + sideC <= sideF & sideB <= sideE & sideD <= sideE) {
            System.out.println("дома помещаются");
        } else if (sideA + sideC <= sideE & sideB <= sideF & sideD <= sideF) {
            System.out.println("дома помещаются");
        } else if (sideA + sideD <= sideF & sideB <= sideE & sideC <= sideE) {
            System.out.println("дома помещаются");
        } else if (sideA + sideD <= sideE & sideB <= sideF & sideC <= sideF) {
            System.out.println("дома помещаются");
        } else if (sideC + sideB <= sideF & sideA <= sideE & sideD <= sideE) {
            System.out.println("дома помещаются");
        } else if (sideC + sideB <= sideE & sideA <= sideF & sideD <= sideF) {
            System.out.println("дома помещаются");
        } else {
            System.out.println("дома не помещаются");
        }
    }
}
