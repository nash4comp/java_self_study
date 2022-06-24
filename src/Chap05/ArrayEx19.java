package Chap05;

public class ArrayEx19 {

    public static void main(String[] args) {
        int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 },
                { 40, 40, 40 }, { 50, 50, 50 } };
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("============================================");
        // i는 번호를 loop로 돌린다.
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i + 1);
            // j는 국영수 점수를 loop로 돌린다.
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            } // end of for j
            avg = sum / (float) score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        } // end of for i
        System.out.println("============================================");
        System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
    } // end of main
}
