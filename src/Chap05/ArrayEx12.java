// 향상된 for문을 활용한 배열의 값 접근 예제

package Chap05;

public class ArrayEx12 {

    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]: " + names[i]);
        }
        String tmp = names[2];
        System.out.println("tmp: " + tmp);
        names[0] = "Yu";

        /*
         * 향상된 for문(enhanced for statement) names 배열의 처음부터 마지막까지 loop를 돈다. for
         * (타입 변수명 : 배열 또는 컬랙션) 여기서 타입 변수명은 실제 배열에 들어있는 리터럴 값의 타입을 지정하면 된다. 아래의
         * 경우, names 배열에 저장되어있는 리터럴 값의 타입이 String이고, 이를 str로 명명한 것이다. 즉, names
         * 배열의 시작부터 끝까지 루프를 돌면서 그 안에 있는 names[0]의 값부터 String str에 저장하라는 의미이다.
         */
        for (String str : names) {
            System.out.println(str);
        }

    }

}
