package myPackage;

//      Коллекция List

import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(100);
        list.add(9);

        System.out.println(list.get(1));

        list.set(2, 100);

        System.out.println(list.get(2));

        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));

        System.out.println(list.size());

        list.add(9);

        System.out.println(list.size());

//        list.clear();

        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list.add(45);
        list.add(56);

        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());

        list.removeAll(list2);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list.isEmpty());

        list.add(100);
        System.out.println(list.contains(100));

        list.addAll(list2);
        System.out.println(list.containsAll(list2));

        Iterator<Integer> iterator = list.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
