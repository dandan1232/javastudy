package threaddemo;

class Plate {
    private int apple;
    boolean isEmpty = false;

    public synchronized int getApple() {
        while (isEmpty == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"拿了第" + apple + "个苹果");
        this.isEmpty = false;
        notifyAll();
        return apple;
    }

    public synchronized void setApple(int apple) {  //synchronized锁
        while (isEmpty == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.apple = apple;
        this.isEmpty = true;
        System.out.println("父母放进了第" + apple + "个苹果");
        notifyAll(); //哥哥弟弟都在等锁释放
    }
}

class Child extends Thread {
    Plate plate = null;

    public Child(Plate plate) {
        super();
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {

            int applegotten = plate.getApple();

        }
    }
}

class Parents extends Thread {
    Plate plate = null;

    public Parents(Plate plate) {
        super();
        this.plate = plate;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            plate.setApple(i);
        }
    }
}

public class Demo14_CooperateApplePlane {
    public static void main(String[] args) {
        Plate plate = new Plate();

        Child child1 = new Child(plate);
        child1.setName("哥哥");
        child1.start();

        Child child2 = new Child(plate);
        child2.setName("弟弟");
        child2.start();

        Parents parents=new Parents(plate);
        parents.start();
    }
}
