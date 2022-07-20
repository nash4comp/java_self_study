// 매칭되는 단어 찾아서 바꾸기

package Chap09.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {

    public static void main(String[] args) {
        String source = "A broken hand works, but not a broken heart.";
        String pattern = "broken";
        StringBuffer sb = new StringBuffer();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        System.out.println("source:" + source);

        int i = 0;
        while (m.find()) {
            // 문자열 source에 "broken"을 m.find()로 찾은 후 처음으로 m.appendReplacement(sb, "drunken");가 호출되면
            // source의 시작부터 "broken"을 찾은 위치까지의 내용에 "drunken"을 더해서 저장한다.
            // 즉, sb에 최초에 저장될 내용은 "A drunken"이 된다.
            // 이후, m.find()는 첫번째로 발견된 위치의 끝에서부터 다시 검색을 시작하여 두번째 broken을 찾고 이어서 작업한다.
            System.out.println(++i + "번째 매칭:" + m.start() + "~" + m.end());
            m.appendReplacement(sb, "drunken");
        } // end of while

        m.appendTail(sb);
        System.out.println("Replacement count : " + i);
        System.out.println("result:" + sb.toString());
    }
}
