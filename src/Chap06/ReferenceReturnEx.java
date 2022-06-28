package Chap06;

class Data3 {
    int x;
}

public class ReferenceReturnEx {

    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        // d2에서는 d를 복사한 객체의 값을 가져갈 수 있다.
        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    } // end of main

    /**
     * @Method copy
     * @type Data3
     * @param d
     * @return Data3 타입의 객체 tmp
     * 
     * @description
     * 
     *              static 메서드이며, Data3 타입으로 리턴을 하는 함수이다. Data3 타입의 객체 d를 파라메터로
     *              받아서, 새로운 Data3 타입의 객체 tmp를 생성하고 생성된 tmp 객체에 파라메터로 받은 객체의 x의
     *              값을 복사하고 tmp 객체를 반환한다. 이 메서드가 종료되면 tmp 객체는 소멸한다.
     * 
     *              참고로 copy는 static 메서드이므로 클래스가 생성될때 메모리에 올라가며, 인스턴스를 생성하지 않고
     *              직접 호출이 가능하다.
     * 
     */
    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();
        tmp.x = d.x;
        return tmp;

    } // end of copy

} // end of class
