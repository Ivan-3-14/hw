package homework.four.task8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String line;

        try (BufferedReader reader1 = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task8\\INPUT_1"),
                        StandardCharsets.UTF_8)
        ); BufferedReader reader2 = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task8\\INPUT_2"),
                        StandardCharsets.UTF_8)
        ); BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task8\\OUTPUT")
        )) {
            while ((line = reader1.readLine()) != null) {
                list1.add(line);
            }
            while ((line = reader2.readLine()) != null) {
                list2.add(line);
            }

            for (var element : list1) {
                for (var e : list2) {
                    if (element.equals(e)) {
                        result.add(element);
                    }
                }
            }
            for (var elements : result) {
                bw.write(elements + '\n');
            }
            System.out.println("Please, check file OUTPUT");

        } catch (FileNotFoundException e) {
            System.err.println("Error! File Not Found!");
        } catch (IOException e) {
            System.err.println("Error!" + e);
        }
    }
}

