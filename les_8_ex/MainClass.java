package les_8_ex;


public class MainClass {
    public static void main(String[] args) {
        Material material = new Material();
        ResourceLock lock = new ResourceLock();
        new Loader(material, lock);
        new Transporter(material, lock);
        new Unloader(material, lock);
    }
}
