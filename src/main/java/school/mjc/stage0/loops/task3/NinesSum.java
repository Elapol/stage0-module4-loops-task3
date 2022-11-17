package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        calculateSum(3); // 9+99+999+9999+99999=111105
    }

    public static void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int sum = 0;
        for (int counter = 1; counter <= lengthOfLastNumber; counter++) {
            result = result * 10 + 9;
            sum = sum + result;
            if (counter == lengthOfLastNumber) {
                System.out.println(sum);

            }
        }
    }
}
