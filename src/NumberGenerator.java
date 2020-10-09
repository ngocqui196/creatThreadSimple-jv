public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int random = (int) Math.floor(Math.random()*99 +1);
            System.out.println(this + " Lần " + i + " " + random);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hết giờ.");
    }
}
