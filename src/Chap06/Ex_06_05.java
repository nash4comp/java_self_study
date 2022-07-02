package Chap06;

public class Ex_06_05 {

    public static void main(String[] args) {
        Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());

    } // end of main

} // end of class

class Student1 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student1() {
        this("홍길동", 1, 1, 50, 50, 50);
    }

    Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return this.kor + this.eng + this.math;
    }

    float getAverage() {
        return (float) Math.round((getTotal() / 3.0) * 10) / 10;
    }

    String info() {
        String delim = ",";
        return name + delim + ban + delim + no + delim + kor + delim + eng
                + delim + math + delim + getTotal() + delim + getAverage();
    }

}
