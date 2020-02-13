package les_8_ex;

public class Transporter implements Runnable {
    Material material;
    ResourceLock lock;

    public Transporter(Material material, ResourceLock lock) {
        this.material = material;
        this.lock = lock;
        new Thread(this).start();
    }


    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 16; i++) {
                    while (lock.flag != 2) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    material.Transporter();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.flag = 3;
                    lock.notifyAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
