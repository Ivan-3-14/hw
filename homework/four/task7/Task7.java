package homework.four.task7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) throws IOException, ClassCastException {
        List<String> list = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task7\\INPUT"),
                        StandardCharsets.UTF_8)
        ); BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task7\\OUTPUT")
        )) {
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            List<String> reverse = new ArrayList<>(list.size());
            for (int i = list.size() - 1; i >= 0; i--) {
                reverse.add(list.get(i));
            }
            for (var elements : reverse) {
                bw.write(elements + '\n');
            }
            System.out.println("Please, check file OUTPUT");
        } catch (FileNotFoundException e) {
            System.err.println("Error! File Not Found!" + e);
        } catch (IOException e) {
            System.err.println("Error!" + e);
        }
    }
}


