package checkout;

public class Buyer2 implements Runnable {
    private Checkout goods;

    public Buyer2(Checkout goods) {
        this.goods = goods;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int qnt = 1;
        while (true) {
            System.out.println("Buyer2 trying to access checkout");
            goods.serveBuyer(qnt+1);
        }

    }
}
