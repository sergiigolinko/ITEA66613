package les_8_ex;


public class Loader implements Runnable {
    private Material lock;
    private Material material;
    private static int loadingMaterial;


    public Loader(Material material, Material lock) {
        this.material = material;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 16; i++) {
                    while (lock.flag != 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    loadingMaterial += 6;
                    material.Loader();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.flag = 2;
                    lock.notifyAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int getLoadingMaterial() {
        return loadingMaterial;
    }

}
