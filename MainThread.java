package l6p;

import less6.RandomNumberGeneration;

public class MainThread {
    public static void main(String[] args) {
        RandomNumberGeneration randomNumberGeneration1=new RandomNumberGeneration("A");
        RandomNumberGeneration randomNumberGeneration2=new RandomNumberGeneration("B");
        randomNumberGeneration1.start();
        randomNumberGeneration2.start();
    }

}
