import java.util.Scanner;

public class task_6 {
    public static void main(String[] args){
  //       Допустим, имеем две точки с координатами C(x1;y1) и D(x2;y2)
  //       Уравнение прямой, проходящей через 2 точки будет иметь вид y = a*x + b
  //       Для нахождения уравнения применяем следующее равенство (x-x1)/(x2-x1) = (y-y1)//(y2-y1)

  //       задаём координаты точек C(x1;y1) и D(x2;y2)
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 8;

  //        находим коэффициенты а и b
        int a = (y2 - y1)/(x2 - x1);
        int b = ((y2 - y1)/(x2 - x1))-y1;

        System.out.println("y = " + a + "*x " + "+ " + b);
    }
}
