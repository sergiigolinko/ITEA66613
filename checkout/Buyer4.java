package checkout;

public class Buyer4 implements Runnable {
    private Checkout goods;
    public Buyer4(Checkout goods){
        this.goods=goods;
        new Thread(this).start();
    }
    @Override
    public void run() {
        int qnt=1;
        while (true){
            System.out.println("Buyer4 trying to access checkout");
            goods.serveBuyer(qnt+3);
        }

    }
}
