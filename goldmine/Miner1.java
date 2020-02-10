package goldmine;

public class Miner1 implements Runnable {
    private GoldMine gold;
    private String name;
    public Miner1(GoldMine gold,String name){
        this.gold=gold;
        this.name=name;
        //new Thread(this).start();
    }

    @Override
    public void run() {
        while (true){
            System.out.println(name + " is trying to mine ");
            System.out.println(gold.getGold(3));

        }

    }
}
