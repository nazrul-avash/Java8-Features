import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LambdaExp walk = new LambdaExp();
        walk.doWalk();
        System.out.println(walk.getClass());
        Walkable walk2 = new Misc();
        System.out.println(walk2.getClass());
        walk2.doWalk();
        Walkable run = () -> {
            System.out.println("This is the implementation of Walkable Interface via Lambda Expression");
        };
        run.doWalk();
        Calculation cal = new Calculation();
        double array[] = {45.4, 6756.6, 23.005, 9.5};
        List<Double> list = new ArrayList<Double>();
        for (double x : array) {
            list.add(x);
        }
        cal.showResult(list);
    }
}
