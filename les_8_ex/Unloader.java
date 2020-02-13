package les_8_ex;

public class Unloader implements Runnable {
    private Material material;
    private Material lock;

    public Unloader(Material material, Material lock) {
        this.material = material;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 16; i++) {
                    while (lock.flag != 3) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    material.Unloader();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.flag = 1;
                    lock.notifyAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
