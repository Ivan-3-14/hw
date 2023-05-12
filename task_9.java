import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("введите количество секунд");
        int x = scan.nextInt();

        int hours = x / 3600;
        int minutes = (x % 3600) / 60;
        int secundes = x % 60;

        if (hours == 0) {
            if (minutes == 0) {
                if (secundes % 100 > 10 & secundes % 100 < 15) {
                    System.out.print(" " + secundes + " секунд ");
                } else {

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
                if (minutes % 100 > 10 & minutes % 100 < 15) {
                    System.out.print(" " + minutes + " минут ");
                } else {
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
                if (secundes % 100 > 10 & secundes % 100 < 15) {
                    System.out.print(" " + secundes + " секунд ");
                } else {
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

                    if (hours % 100 > 10 & hours % 100 < 15) {
                        System.out.print(" " + minutes + " минут ");
                    } else {
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
                    if (minutes % 100 > 10 & minutes % 100 < 15) {
                        System.out.print(" " + minutes + " минут ");
                    } else {
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
                    if (secundes % 100 > 10 & secundes % 100 < 15) {
                        System.out.print(" " + secundes + " секунд ");
                    } else {
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
    }
}




