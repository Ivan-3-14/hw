package src;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<RobotPart> dump = new LinkedBlockingQueue<>();
        Dump myDump = new Dump(dump);

        Scientist sc1 = new Scientist("First Scientist", dump, "[32m");
        Scientist sc2 = new Scientist("Second Scientist", dump, "[36m");

        Thread sc1Thread = new Thread(sc1);
        Thread sc2Thread = new Thread(sc2);
        Thread dumpThread = new Thread(myDump);

        dumpThread.start();
        sc1Thread.start();
        sc2Thread.start();

        sc1Thread.join();
        sc2Thread.join();
        getResults(sc1,sc2);
    }

    public static void getResults(Scientist sc1, Scientist sc2) throws InterruptedException {
        if (sc1.getCountOfRobots() < sc2.getCountOfRobots()){
            System.out.println((char) 27 + "[33m" + sc2.getName() +" won with " + sc2.getCountOfRobots() + " robots" +
                    (char) 27 + "[0m"
            );
        } else if (sc1.getCountOfRobots() > sc2.getCountOfRobots()){
            System.out.println((char) 27 + "[33m" + sc1.getName() + " won with " + sc1.getCountOfRobots() + " robots" +
                            (char) 27 + "[0m"
                    );

        } else {
            System.out.println((char) 27 + "[31mIt's a tie! Nobody won with " + sc1.getCountOfRobots() + " robots" +
                    (char) 27 + "[0m"
            );
        }
    }
}
