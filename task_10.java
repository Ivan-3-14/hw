import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("введите количество секунд");
        int n = scan.nextInt();


        int hours = n / 3600;

        switch (hours) {
            case 0:
                System.out.println("Осталось менее часа");
                break;
            case 1:
                System.out.println("Остался " + hours + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Осталось " + hours + " часa");
                break;
            default:
                System.out.println("Осталось " + hours + " часов");
                break;
        }
    }

    }
