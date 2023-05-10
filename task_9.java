import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("введите количество секунд");
        int x = scan.nextInt();

        int hours = x / 3600;
        int minutes = (x % 3600) / 60;
        int secundes = x % 60;

//        Есть проблема с 11, 12, 13, 14 часами, минутами и секундами - не подходит окончание. Пока не придумал, как это решить

        if (hours == 0) {
            if (minutes == 0) {
                switch (secundes % 100) {
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        System.out.print(" " + secundes + " секунд ");
                        break;
                    default:

                        switch (secundes % 10) {
                            case 0:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                System.out.print(" " + secundes + " секунд ");
                                break;
                            case 2:
                            case 3:
                            case 4:
                                System.out.print(" " + secundes + " секунды ");
                                break;
                            case 1:
                                System.out.print(" " + secundes + " секунда ");
                                break;
                            default:
                                System.out.println();
                        }

                }
            } else {
                switch (minutes % 100) {
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        System.out.print(" " + minutes + " минут ");
                        break;
                    default:
                        switch (minutes % 10) {
                            case 0:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                System.out.print(minutes + " минут ");
                                break;
                            case 2:
                            case 3:
                            case 4:
                                System.out.print(minutes + " минуты ");
                                break;
                            case 1:
                                System.out.print(minutes + " минута ");
                                break;
                            default:
                                System.out.println();
                        }
                }
                switch (secundes % 100) {
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        System.out.print(" " + secundes + " секунд ");
                        break;
                    default:
                        switch (secundes % 10) {
                            case 0:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                System.out.print(" " + secundes + " секунд ");
                                break;
                            case 2:
                            case 3:
                            case 4:
                                System.out.print(" " + secundes + " секунды ");
                                break;
                            case 1:
                                System.out.print(" " + secundes + " секунда ");
                                break;
                            default:
                                System.out.println();
                        }
                }


            }
        } else {
            switch (hours % 100) {
                case 11:
                case 12:
                case 13:
                case 14:
                    System.out.print(" " + hours + " часов ");
                    break;
                default:
                    switch (hours % 10) {
                        case 0:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            System.out.print(" " + hours + " часов ");
                            break;
                        case 2:
                        case 3:
                        case 4:
                            System.out.print(" " + hours + " часa ");
                            break;
                        case 1:
                            System.out.print(" " + hours + " час ");
                            break;
                        default:
                            System.out.println("ошибка");
                    }
            }
            switch (minutes % 100) {
                case 11:
                case 12:
                case 13:
                case 14:
                    System.out.print(" " + minutes + " минут ");
                    break;
                default:
                    switch (minutes % 10) {
                        case 0:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            System.out.print(minutes + " минут ");
                            break;
                        case 2:
                        case 3:
                        case 4:
                            System.out.print(minutes + " минуты ");
                            break;
                        case 1:
                            System.out.print(minutes + " минута ");
                            break;
                        default:
                            System.out.println();
                    }
            }
            switch (secundes % 100) {
                case 11:
                case 12:
                case 13:
                case 14:
                    System.out.print(" " + secundes + " секунд ");
                    break;
                default:
                    switch (secundes % 10) {
                        case 0:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            System.out.print(" " + secundes + " секунд ");
                            break;
                        case 2:
                        case 3:
                        case 4:
                            System.out.print(" " + secundes + " секунды ");
                            break;
                        case 1:
                            System.out.print(" " + secundes + " секунда ");
                            break;
                        default:
                            System.out.println();


                    }
            }
        }
    }
}


