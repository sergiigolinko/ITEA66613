package les_8_ex;


public class MainClass {
    public static void main(String[] args) {
        Material material = new Material();
        Material lock=new Material();
        new Loader(material,lock);
        new Transporter(material, lock);
        new Unloader(material, lock);
    }
}
