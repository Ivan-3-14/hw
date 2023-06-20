package homework.four.task9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task9 {
    public static void main(String[] args) {

        try ( FileOutputStream fos = new FileOutputStream(
                        "C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task9\\file");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            int count = 5;

            for (int i = 1; i <= count; i++) {
                Box box = new Box(12 / i, i * 2, 7 / i );
                oos.writeObject(box);
            }
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
