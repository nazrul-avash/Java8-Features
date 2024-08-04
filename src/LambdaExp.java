import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaExp implements Walkable{
    @Override
    public void doWalk() {
        System.out.println("This is implementation of Walkable Interface");
    }
    public void doTalk(){
//        Map<Integer,String> students = HashMap.newHashMap(6);
//        students.put(2,"R. Sterling");
//        students.put(3,"Mr. Lambda");
//        students.put(4,"Mrs. Thompson Herrington");
//        students.put(null,"null2");
//        students.put(null,null);
//        students.put(null,"asdf");
//        students.put(null,"null2");
//
////        for(Integer i: students.keySet()){
////            System.out.println(i);
////        }
////        for(String i: students.values()){
////            System.out.println(i);
////        }
//        students.forEach((k,v)-> System.out.println(k+"  "+v));
//        List<String> list = new ArrayList<>();
//        list.add("Humming Bird");
//        list.add("Sparrow");
//        list.add(null);
//        list.add("null");
//        list.add("Humming Bird");
//        list.forEach(x-> System.out.println(x));
//        Set<String> set = list.stream().map(x->x+"$").collect(Collectors.toSet());
//        System.out.println(set.getClass());
//        System.out.println("------------------------------");
//        set.forEach(x-> System.out.println(x));
        System.out.println(getClass());
    }
}
