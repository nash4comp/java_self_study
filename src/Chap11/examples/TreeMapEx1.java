// TreeMap 동작 원리에 관한 예제

package Chap11.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {

    public static void main(String[] args) {
        String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z",
                "D" };
        TreeMap map = new TreeMap();
        // data에 있는 값들의 중복된 수를 카운트하면서 TreeMap 타입의 참조변수 map에 넣는다.
        for (int i = 0; i < data.length; i++) {
            // data의 인덱스 0부터 끝까지 map에 있는지 확인하여 있으면(중복되면)
            if (map.containsKey(data[i])) {
                // map.get은 map 값의 해당 인덱스에 들어있는 String의 value를 가져온다.
                Integer value = (Integer) map.get(data[i]);
                // map의 해당 인덱스에 있는 값(중복값)의 key에 mapping되는 value의 값을 1 더해서 넣는다.
                // 즉, 처음에는 value가 1로 되어있으나, 중복되면 value가 1씩 증가되어 저장된다.
                // 이것이 counter의 역할을 하게 된다. (별도 counter 변수 불필요하고 value를 활용)
                map.put(data[i], new Integer(value.intValue() + 1));
            } else {
                // 없으면(중복이 아니면), 해당 data 인덱스의 String 값을 map의 인덱스에 순차적으로
                // key 값으로 넣는다. 그리고 value는 1로 셋팅한다.
                map.put(data[i], new Integer(1));
            } // end of if map
        } // end of for i
          // TreeMap에 저장된 key와 value을 Entry(key와 value의 결합)의 형태로 Set에 저장해서
          // return
          // 이것을 iterator 객체로 return하여 그 주소값을 Iterator 타입의 참조변수 it에 저장한다.
        Iterator it = map.entrySet().iterator();
        System.out.println("= 기본 정렬 =");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            // value는 해당 String의 counter
            int value = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value)
                    + " " + value);
        } // end of while
        System.out.println();

        // map을 ArrayList로 변환한 다음에 Collections.sort()로 정렬
        Set set = map.entrySet();
        List list = new ArrayList(set);

        // static void sort(List list, Comparator c)
        Collections.sort(list, new ValueComparator());

        it = list.iterator();
        System.out.println("= 값의 크기가 큰 순서로 정렬 =");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value)
                    + " " + value);
        } // end of while

    } // end of main

    static class ValueComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;

                int v1 = ((Integer) e1.getValue()).intValue();
                int v2 = ((Integer) e2.getValue()).intValue();
                return v2 - v1;
            } // end of if o1
            return -1;
        } // end of compare
    } // end of class ValueComparator

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];
        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        } // end of for i
          // String 타입을 새롭게 선언하는데, char 배열인 bar를 String으로 변환해서 그것을 넣는다.
          // 그리고 그 String을 return 한다.
        return new String(bar);
    } // end of printBar

}
