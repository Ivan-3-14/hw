package homework.five;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static homework.five.Utils.findPart;
import static homework.five.Utils.generateRobotPart;
import static java.lang.Thread.*;


public class RobotWar {

    private static final Integer COUNT_OF_ROBOTS = 20;
    private static final ArrayList<String> STORAGE = new ArrayList<>();
    private static final Set<String> EASTASIA_STOCK = new HashSet<>();
    private static final Set<String> EURASIA_STOCK = new HashSet<>();
    private static final Set<String> OCEANIA_STOCK = new HashSet<>();
    private static int end = 0;
    private static final int mills = 1;
    private static int countOceania = 0;
    private static int countEastasia = 0;
    private static int countEurasia = 0;
    private static String result = "result";

    protected static void factory() throws InterruptedException {
        synchronized (STORAGE) {
            while (true) {
                if (end == 1) {
                    System.out.println();
                    System.out.println((char) 27 + "[33mEnd of robot's war! ");
                    return;
                }
                String part = generateRobotPart();
                System.out.println("factory produced: " + part);
                STORAGE.add(part);
                STORAGE.wait(mills);
            }
        }
    }

    protected static void oceania() throws InterruptedException {
        createCountry("Oceania", OCEANIA_STOCK, countOceania, "[32m");
    }

    protected static void eastasia() throws InterruptedException {
        createCountry("Eastasia", EASTASIA_STOCK, countEastasia, "[36m");
    }

    protected static void eurasia() throws InterruptedException {
        createCountry("Eurasia", EURASIA_STOCK, countEurasia, "[35m");
    }


    protected static void createCountry(String name, Set<String> NAME_STOCK, int count, String message) throws InterruptedException {
        synchronized (STORAGE) {
            while (true) {
                while (STORAGE.size() == 0 || result == null) {
                    result = "result";
                    STORAGE.wait(mills);
                }
                sleep(mills);
                result = findPart(STORAGE, NAME_STOCK);
                if (result != null) {
                    NAME_STOCK.add(result);
                    STORAGE.remove(result);
                    System.out.println(name + " get: " + result);
                }
                if (STORAGE.isEmpty() || result == null) {
                    STORAGE.notifyAll();
                }
                if (NAME_STOCK.size() == 6) {
                    count++;
                    NAME_STOCK.clear();
                    System.out.println((char) 27 + message + name + " make " + count + " robot" + (char) 27 + "[0m");
                }
                if (count == COUNT_OF_ROBOTS) {
                    System.out.println();
                    System.out.println((char) 27 + "[31m" + name + " win in robot's war! " + (char) 27 + "[0m");
                    end = 1;
                }
                if (end == 1) {
                    return;
                }
            }
        }
    }
}
