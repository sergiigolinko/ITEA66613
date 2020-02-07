package checkout;

public class Buyer1 implements Runnable {
    private Checkout goods;
    public Buyer1(Checkout goods){
        this.goods=goods;
        new Thread(this).start();
    }
    @Override
    public void run() {
        int qnt=1;
        while (true){
            System.out.println("Buyer1 trying to access checkout");
            goods.serveBuyer(qnt);
        }

    }
}
