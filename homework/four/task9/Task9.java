package homework.four.task9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task9 {
    public static void main(String[] args) {
        Box box1 = new Box(1, 1, 1);
        Box box2 = new Box(3, 2, 3);
        Box box3 = new Box(2, 3, 2);
        Box box4 = new Box(4, 2, 3);
        Box box5 = new Box(3, 5, 1);

        try ( FileOutputStream fos = new FileOutputStream(
                        "C:\\Users\\user\\IdeaProjects\\untitled\\src\\homework\\four\\task9\\file");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(box1);
            oos.writeObject(box2);
            oos.writeObject(box3);
            oos.writeObject(box4);
            oos.writeObject(box5);
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
