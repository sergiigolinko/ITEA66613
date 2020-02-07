package checkout;

public class Checkout {
    private int goods;
    volatile boolean free = true;

    public synchronized void serveBuyer(int goods) {
        double probability = Math.random() * 1 + 0.3;
        if (free) {
            try {
                wait((int) (Math.random() * 5 + 3) * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Serve : " + goods);
        this.goods = goods;
        if (probability == 0.3) {
            System.out.println("Checkout is closed");
            System.exit(0);
        }
        free = true;
        notifyAll();

    }

}
