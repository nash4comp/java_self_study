package Chap11.examples;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

    public static void main(String[] args) {
        String[] strArr = { "cat", "Dog", "lion", "tiger" };

        Arrays.sort(strArr);
        System.out.println("strArr= " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr= " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr= " + Arrays.toString(strArr));
    } // end of main
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            // -1을 곱해서 기본 정렬방식의 역의 순으로 변경한다.
            return c1.compareTo(c2) * -1;
        } // end of if o1, o2
        return -1;
    } // end of compare
} // end of class Descending
