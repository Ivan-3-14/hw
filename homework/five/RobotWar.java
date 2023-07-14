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
        int countOceania = 0;
        synchronized (STORAGE) {
            while (true) {
                while (STORAGE.size() == 0 || result == null) {
                    result = "result";
                    STORAGE.wait(mills);
                }
                sleep(mills);
                result = findPart(STORAGE, OCEANIA_STOCK);
                if (result != null) {
                    OCEANIA_STOCK.add(result);
                    STORAGE.remove(result);
                    System.out.println("Oceania get: " + result);
                }
                if (STORAGE.isEmpty() || result == null) {
                    STORAGE.notifyAll();
                }
                if (OCEANIA_STOCK.size() == 6) {
                    countOceania++;
                    OCEANIA_STOCK.clear();
                    System.out.println((char) 27 + "[32mOceania make " + countOceania + " " + (char) 27 + "[32mrobot" + (char) 27 + "[0m");
                }
                if (countOceania == COUNT_OF_ROBOTS) {
                    System.out.println();
                    System.out.println((char) 27 + "[31mOceania win in robot's war! " + (char) 27 + "[0m");
                    end = 1;
                }
                if (end == 1) {
                    return;
                }
            }
        }
    }

    protected static void eastasia() throws InterruptedException {
        int countEastasia = 0;
        synchronized (STORAGE) {
            while (true) {
                while (STORAGE.size() == 0 || result == null) {
                    result = "result";
                    STORAGE.wait(mills);
                }
                sleep(mills);
                result = findPart(STORAGE, EASTASIA_STOCK);
                if (result != null) {
                    EASTASIA_STOCK.add(result);
                    STORAGE.remove(result);
                    System.out.println("Eastasia get: " + result);
                }
                if (STORAGE.isEmpty() || result == null) {
                    STORAGE.notifyAll();
                }
                if (EASTASIA_STOCK.size() == 6) {
                    countEastasia++;
                    EASTASIA_STOCK.clear();
                    System.out.println((char) 27 + "[36mEastasia make " + countEastasia + " " + (char) 27 + "[36mrobot" + (char) 27 + "[0m");
                }
                if (countEastasia == COUNT_OF_ROBOTS) {
                    System.out.println();
                    System.out.println((char) 27 + "[31mEastasia win in robot's war! " + (char) 27 + "[0m");
                    end = 1;
                }
                if (end == 1) {
                    return;
                }
            }
        }
    }

    protected static void eurasia() throws InterruptedException {
        int countEurasia = 0;
        synchronized (STORAGE) {
            while (true) {
                while (STORAGE.size() == 0 || result == null) {
                    result = "result";
                    STORAGE.wait(mills);
                }
                sleep(mills);
                result = findPart(STORAGE, EURASIA_STOCK);
                if (result != null) {
                    EURASIA_STOCK.add(result);
                    STORAGE.remove(result);
                    System.out.println("Eurasia get: " + result);
                }
                if (STORAGE.isEmpty() || result == null) {
                    STORAGE.notifyAll();
                }
                if (EURASIA_STOCK.size() == 6) {
                    countEurasia++;
                    EURASIA_STOCK.clear();
                    System.out.println((char) 27 + "[35mEurasia make " + countEurasia + " " + (char) 27 + "[35mrobot" + (char) 27 + "[0m");
                }
                if (countEurasia == COUNT_OF_ROBOTS) {
                    System.out.println();
                    System.out.println((char) 27 + "[31mEurasia win in robot's war! " + (char) 27 + "[0m");
                    end = 1;
                }
                if (end == 1) {
                    return;
                }
            }
        }
    }
}
