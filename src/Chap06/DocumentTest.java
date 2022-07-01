package Chap06;

class Document {
    static int count = 0;
    String name;

    Document() {
        // Overriding된 다른 constructor를 호출한다.
        this("제목없음" + ++count);

    } // end of constructor Document

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");

    } // end of constructor Document

} // end of class Document

public class DocumentTest {

    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();

    } // end of main

} // end of class DocumentTest
