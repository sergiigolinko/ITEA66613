package goldmine;

public class GoldMine {
    private volatile int gold = 100;
    private volatile boolean empty = true;


    public synchronized int getGold(int minerGold) {
        if (!empty) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (gold > minerGold) {
            gold = gold - minerGold;
            empty = false;
            notify();
            return minerGold;
        } else if (gold > 0 && gold < minerGold) {
            int left = gold;
            gold = 0;
            empty = false;
            notify();
            return left;
        } else if (gold == 0) {
            empty = false;
            notify();
            return 0;
        }
        return 0;
    }
}
