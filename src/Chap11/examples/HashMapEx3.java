// 전화번호부를 생성하고 출력하는 예제
package Chap11.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");
        printList();
    } // end of main

    // 그룹에 전화번호를 추가하는 메서드
    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name); // 이름은 중복될 수 있으므로, 전화번호를 key로 설정한다.
    } // end of addPhoneNo

    // 그룹을 추가하는 메서드
    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    } // end of addGroup

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    } // end of addPhoneNo

    // 전화번호부 전체를 출력하는 메서드
    static void printList() {
        // phoneBook의 key와 value의 entry 주소값을 Set 타입 참조변수 set에 할당한다.
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            // Map.Entry는 Map 형태의 인터페이스를 만드는데 위해서 선언하는 타입이다.
            // iteration을 돌릴때 이러한 Map 형식의 데이터 처리가 필요하다.
            Map.Entry e = (Map.Entry) it.next();

            // 위에서 Map.Entry 형태로 다음 entry를 받아온 다음에 value를 뽑아낸다.
            // 뽑아낸 value를 HashMap 형태로 형변환 해주고, 이를 다시 key와 value의 entry로 만들어서
            // 그 주소값을 Set 타입의 참조변수 subSet에 할당한다.
            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
            } // end of while
            System.out.println();

        } // end of while
    } // end of printList

} // end of class
