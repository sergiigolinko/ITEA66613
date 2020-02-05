package l6p;

import less6.RandomNumberGeneration;


public class MainThread {
    public static void main(String[] args) {
        RandomNumberGeneration randomNumberGeneration1 = new RandomNumberGeneration("A");
        Thread a = new Thread(randomNumberGeneration1);
        RandomNumberGeneration randomNumberGeneration2 = new RandomNumberGeneration("B");
        Thread b = new Thread(randomNumberGeneration2);
        a.start();
        b.start();
        System.out.println(Thread.activeCount());
        while (a.isAlive() || b.isAlive()) {
        }
        System.out.println("Random SumA=" + randomNumberGeneration1.randSum());
        System.out.println("Random SumB=" + randomNumberGeneration2.randSum());

    }

}
