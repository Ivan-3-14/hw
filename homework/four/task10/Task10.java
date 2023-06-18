package homework.four.task10;

import homework.four.task9.Box;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {

        List<Box> list = new ArrayList<>();
        try (
                FileInputStream filInSt = new FileInputStream("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task9\\file");
                ObjectInputStream obInSt = new ObjectInputStream(filInSt);
                BufferedWriter buffWr = new BufferedWriter(
                        new FileWriter("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task10\\OUTPUT")
                )) {
            while (list.size() < 5) {
                list.add((Box) obInSt.readObject());
            }
            filInSt.close();
            list.sort(new Comparator<>() {
                @Override
                public int compare(Box o1, Box o2) {
                    if (o1.volume() == o2.volume()) {
                        return 0;
                    } else {
                        if (o1.volume() > o2.volume()) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                }
            });

            for (var element : list) {
                System.out.println(element);
            }

            Box result = (list.get(list.size() - 1));
            String twist = Integer.toString(result.volume());
            buffWr.write(twist);
            System.out.println("Please, check file OUTPUT");

        } catch (EOFException eofe) {
            System.out.println("End of file reached");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
