import java.util.Random;

public class Xyclass {
    Random rand = new Random();
    public final int x = rand.nextInt(1000), y = rand.nextInt(1000);

    void getX(){
        System.out.println(x);
    }

    void getY(){
        System.out.println(y);
    }
}
