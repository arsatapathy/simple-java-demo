package bitwise;


import java.math.BigDecimal;
import java.util.*;

public class SimpleJava {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

        List<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        System.out.println("ASHISH".substring(2, 3));

        Map<Integer, Integer> map = new HashMap<>();

        map.put(1,2);

        int x = map.get(1);

        System.out.println(x);

        int[] arr = new int[]{1,2,3};


    }
}

class Student {

    public void getName() {



    }

}

class Ashish extends Student {

    @Override
    public void getName() {

    }

    public void getName(int x) {

    }
}