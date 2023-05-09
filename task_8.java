import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("введите номер пальца");
        int x = scan.nextInt();

        switch (x) {
            case 1:
                System.out.println("Большой");
                break;
            case 2:
                System.out.println("Указательный");
                break;
            case 3:
                System.out.println("Средний");
                break;
            case 4:
                System.out.println("Безымянный");
                break;
            case 5:
                System.out.println("Мезинец");
                break;
            default:
                System.out.println("Пальца с таким номером не существует");
        }

    }
}