package homework.five;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Utils {
    private static final Random RANDOM = new Random();
    private static final String[] ROBOT_PART = {
            "Right leg",
            "Left leg",
            "Right hand",
            "Left hand",
            "Body",
            "Head"
    };

    interface InterruptedWrapped {
        void wrap() throws InterruptedException;
    }

    static void call(InterruptedWrapped wrapped) {
        try {
            wrapped.wrap();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String findPart(ArrayList<String> arrayList, Set<String> setList) {
        String partOfRobot = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (setList.size() == 0) {
                partOfRobot = arrayList.get(0);
                break;
            } else {
                if (!setList.contains(arrayList.get(i))) {
                    partOfRobot = arrayList.get(i);
                    break;
                }
            }
        }
        return partOfRobot;
    }

    public static String generateRobotPart() {
        return ROBOT_PART [RANDOM.nextInt(ROBOT_PART.length)];
    }
}
