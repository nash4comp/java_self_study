package Chap11.examples;

import java.util.*;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList<Comparable> list2 = new ArrayList<Comparable>(
                list1.subList(1, 4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println(
                "list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
        print(list1, list2);

        // for문의 변수를 list2.size()-1 부터 감소시키면서 거꾸로 반복한다.
        // 배열의 특성상 앞에서부터 삭제해 나가면, 삭제된 공간에 나머지 것들이 땡겨서 자리를 채워줘야하기 때문이다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        } // end of for i
        print(list1, list2);
    } // end of main

    static void print(ArrayList<Integer> list1, ArrayList<Comparable> list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    } // end of print

}
