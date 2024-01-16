package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static src.Utils.*;

public class Scientist implements Runnable {
    private final List<RobotPart> storage = new ArrayList<>();
    private final BlockingQueue<RobotPart> dump;
    private final String name;
    private final String message;

    private int countOfRobots = 0;
    private Set<RobotPart> tempRobot = new HashSet();


    public Scientist(String name, BlockingQueue<RobotPart> dump, String message) {
        this.name = name;
        this.dump = dump;
        this.message = message;
    }

    @Override
    public void run() {
        while (!FLAG) {
            for (int l = 0; l < RANDOM.nextInt(MAX_NUMBER_OF_THROWS_ROBOT_PART)+1; l++) {
                try {
                    removing();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                checking();
            }
            try {
                Thread.sleep(DELAY_FOR_THROW_DETAILS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println((char) 27 + message + name + " " + countOfRobots);
    }

    public void removing() throws InterruptedException {
        if (dump.size() == 0) {
            return;
        }
        RobotPart temp = dump.poll(100, TimeUnit.MILLISECONDS);
            storage.add(temp);
            System.out.println(name + " got detail " + temp);
            dump.remove(temp);
    }

    public void checking() {
        for(int i = 0; i<storage.size()-1;i++){
            if (!tempRobot.contains(storage.get(i))){
                tempRobot.add(storage.get(i));
                storage.remove(i);
            }
            if (tempRobot.size()==COUNT_OF_ROBOT_PART){
                countOfRobots++;
                System.out.println((char) 27 + message + name + " created " +
                        countOfRobots + " robots" + (char) 27 + "[0m"
                );
                tempRobot.clear();
            }
        }
    }

    public int getCountOfRobots() {
        return countOfRobots;
    }

    public String getName() {
        return name;
    }
}
