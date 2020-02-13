package les_8_ex;

public class Material {
    private int material;
    public volatile int flag = 1;


    public void Loader() {
        material = Loader.getLoadingMaterial();
        System.out.println("Loader has loaded: " + material);
    }

    public void Transporter() {
        System.out.println("Transporter has transported: " + material);
    }

    public void Unloader() {
        System.out.println("Unloader has unloaded: " + material);
    }
}
