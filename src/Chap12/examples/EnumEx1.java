package Chap12.examples;

enum Direction {
    EAST, SOUTH, WEST, NORTH
}

public class EnumEx1 {

    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");
        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);

        System.out.println("d1==d2 ? " + (d1 == d2));
        System.out.println("d1==d3 ? " + (d1 == d3));
        System.out.println("d1.equlas(d3) ? " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));

        switch (d1) {
        case EAST: // 여기서는 Direction.EAST라고 사용하면 안된다.
            System.out.println("The direction is EAST.");
            break;
        case SOUTH:
            System.out.println("The direction is SOUTH.");
            break;
        case WEST:
            System.out.println("The direction is WEST.");
            break;
        case NORTH:
            System.out.println("The direction is NORTH.");
            break;
        } // end of

        Direction[] dArr = Direction.values();
        for (Direction d : dArr)
            // ordinal은 enum이 정의된 순서를 0부터 return
            // 하지만, 내부용이기 때문에 이 값을 열거형 상수의 값으로 사용하지 않는 것이 좋다.
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
    }
}
