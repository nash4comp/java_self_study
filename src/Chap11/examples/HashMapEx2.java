// HashMap의 기본적인 method를 이용해서 데이터 read/write하는 예제

package Chap11.examples;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", new Integer(90));
        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("안자바", new Integer(90));

        // HashMap에 저장된 key와 value를 entry(key와 value의 결합)의 형태로 Set에 저장해서 return
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
        } // end of while
        set = map.keySet();
        System.out.println("참가자 명단:" + set);
        Collection values = map.values();
        it = values.iterator();

        int total = 0;
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            total += i.intValue();
        } // end of while
        System.out.println("총점: " + total);
        System.out.println("평균: " + (float) total / set.size());
        System.out.println("최고점수: " + Collections.max(values));
        System.out.println("최저점수: " + Collections.min(values));

    }

}
