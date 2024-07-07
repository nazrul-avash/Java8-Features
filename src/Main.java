public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LambdaExp walk = new LambdaExp();
        walk.doWalk();
        System.out.println(walk.getClass());
        Walkable walk2 = new Misc();
        System.out.println(walk2.getClass());
        walk2.doWalk();
        Walkable run = ()->{
            System.out.println("This is the implementation of Walkable Interface via Lambda Expression");
        };
        run.doWalk();
    }
}