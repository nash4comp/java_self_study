// 분산환경 프로그래밍에서 활용되는 예시
// 사용자의 컴퓨터에 설치된 프로그램을 변경하지 않고, 서버측의 변경 만으로도 사용자가 새로 개정된
// 프로그램을 사용하는 것이 가능하다.
// 인터페이스를 구현하는 부분만 업그레이드를 하고 서버측에서 getParser 메서드에서 리턴값만 바꿔주면 되기 때문이다.

package Chap07;

// 인터페이스 선언
interface Parseable {
    // 추상 메서드 선언
    public abstract void parse(String fileName);
}

class ParserManager {

    // Parseable 타입으로 반환하는 getParser 메서드 정의
    // 여기서 리턴타입이 Parseable 인터페이스라는 것의 의미는 이 메서드가 Parseable에서 선언한 다양한 메서드들에 대해
    // 실제로 구현을 한 클래스의 객체를 반환한다는 의미이다. 즉, XMLParser 혹은 HTMLParser가 실제로 구현을 했고,
    // 이것들이 구현한 객체를 리턴값으로 반환하다는 뜻이다.

    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            // 아래는 return new HTMLParser()와 동일하다.
            Parseable p = new HTMLParser();
            return p;
        } // end of if type

    } // end of method getParser

} // end of class ParserManager

// 클래스 XMLParser는 Parseable을 구현한다.
class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed.");
    } // end of method parse

} // end of class XMLParser

// 클래스 HTMLParser는 Parseable을 구현한다.
class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    } // end of method parse

} // end of class HTMLParser

public class ParseTest {

    public static void main(String[] args) {
        // Parseable 타입의 참조변수 parser를 선언하고, 이 값에 ParserManager 클래스의 getParser가
        // 주는 리턴값을 넣는다. 즉, 이 리턴값은 인터페이스가 구현된 것의 결과값을 말한다.
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");

    } // end of main

} // end of class ParseTest
