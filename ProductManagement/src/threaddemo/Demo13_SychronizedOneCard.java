package threaddemo;

class Card {
    private int deposit = 1000;

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public synchronized void saveMoney(int money) {
        int deposit = this.getDeposit();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setDeposit(deposit + money);
        System.out.println(Thread.currentThread().getName()
                + "存了1000元，总余额为：" + this.getDeposit());
    }
}

class Borther extends Thread {
    Card card = null;

    public Borther(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
/*           synchronized (card){
                int deposit = card.getDeposit();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                card.setDeposit(deposit + 1000);
                System.out.println(Thread.currentThread().getName()
                        + "存了1000元，总余额为：" + card.getDeposit());
            }*/
            card.saveMoney(1000);
        }
    }
}

public class Demo13_SychronizedOneCard {
    public static void main(String[] args) {
        Card card = new Card();
        Borther borther1 = new Borther(card);
        borther1.setName("大哥");
        borther1.start();

        Borther borther2 = new Borther(card);
        borther2.setName("二哥");
        borther2.start();

        Borther borther3 = new Borther(card);
        borther3.setName("三哥");
        borther3.start();
    }
}
