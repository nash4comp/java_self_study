// arraycopy를 통한 배열 복사
// for문으로 복사하는 것보다 빠르다.
// public static void arraycopy​(Object src, int srcPos, Object dest, int destPos, int length)


package chap05;

public class ArrayEx4 {

    public static void main(String[] args) {
        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        // char 배열은 for문을 사용하지 않고도 print()나 println()으로 배열에 저장된 모든 문자를 출력할 수 있다.
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        // abc를 result로 복사
        System.arraycopy(abc, 0, result, 0, abc.length);

        // num을 result로 (abc에) 이어서 복사
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
        
        // abc를 abc의 길이만큼 num에 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);
        
        // abc를 result의 6번 인덱스부터 3개만 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }

}
