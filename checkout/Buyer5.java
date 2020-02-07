package checkout;

public class Buyer5 implements Runnable {
    private Checkout goods;
    public Buyer5(Checkout goods){
        this.goods=goods;
        new Thread(this).start();
    }
    @Override
    public void run() {
        int qnt=1;
        while (true){
            System.out.println("Buyer5 trying to access checkout");
            goods.serveBuyer(qnt+4);
        }

    }
}
