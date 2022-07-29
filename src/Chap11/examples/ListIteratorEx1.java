// 양방향 이동이 가능한 ListIterator

package Chap11.examples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        ListIterator it = list.listIterator();

        while (it.hasNext()) {
            System.out.print(it.next());
        } // end of while
        System.out.println();

        while (it.hasPrevious()) {
            System.out.print(it.previous());
        } // end of while
        System.out.println();
    }

}
