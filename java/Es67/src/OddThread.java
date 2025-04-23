public class OddThread extends Thread{
    public void run() {
        int num = 1;
        for (int i = 0; i < 1000; ++i) {
            System.out.println(num);
            num = num + 2;
        }
    }
}
