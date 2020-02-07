package checkout;

public class MainClass {
    public static void main(String[] args) {
        Checkout goods=new Checkout();
        new Buyer1(goods);
        new Buyer2(goods);
        new Buyer3(goods);
        new Buyer4(goods);
        new Buyer5(goods);
        
    }
}
