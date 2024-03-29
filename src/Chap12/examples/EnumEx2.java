// enum을 활용하여 동서남북 방향 전환을 하는 예제

package Chap12.examples;

enum Direction2 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;

    // access modifier private이 생략됨
    Direction2(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    } // end of constructor

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Direction2 of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value: " + dir);
        } // end of if dir
        return DIR_ARR[dir - 1];
    } // end of method of

    // 방향을 회전시키는 method. num의 값만큼 90도씩 시계방향으로 회전한다.
    // 동서남북 방향 회전의 최적화된 코드
    public Direction2 rotate(int num) {
        num = num % 4;
        if (num < 0) // num이 음수이면 시계반대 방향으로 회전
            num += 4;
        return DIR_ARR[(value - 1 + num) % 4];
    } // end of method rotate

    public String toString() {
        return name() + " " + getSymbol();
    } // end of toSring

} // end of class enum

public class EnumEx2 {
    public static void main(String[] args) {
        for (Direction2 d : Direction2.values())
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(2);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());

        System.out.println(d1.rotate(1));
        System.out.println(d1.rotate(2));
        System.out.println(d1.rotate(-1));
        System.out.println(d1.rotate(-2));
        System.out.println();
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));

    }

}
