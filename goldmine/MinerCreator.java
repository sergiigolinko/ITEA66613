package goldmine;

public class MinerCreator implements Runnable {
    GoldMine gold;
    public MinerCreator(GoldMine gold){
        this.gold=gold;
        new Thread(this).start();
    }

    @Override
    public void run() {
        new Thread(new Miner1(gold,"A")).start();
        new Thread(new Miner1(gold,"B")).start();
        new Thread(new Miner1(gold,"C")).start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Miner1(gold,"New Thread"));

    }
}
