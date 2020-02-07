package checkout;

public class Buyer3 implements Runnable {
    private Checkout goods;

    public Buyer3(Checkout goods) {
        this.goods = goods;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int qnt = 1;
        while (true) {
            System.out.println("Buyer3 trying to access checkout");
            goods.serveBuyer(qnt+2);
        }

    }
}
