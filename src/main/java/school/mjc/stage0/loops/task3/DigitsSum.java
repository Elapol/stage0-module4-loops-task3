package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        printDigitsSum(451000);
    }

    public static void printDigitsSum(int t) {
        String b = String.valueOf(t);
        b.length();
        int digit = 0;
        int sum;
        for (sum = 0; t > 0; digit = t % 10) {
            sum = sum + digit;
            t = t / 10;
            System.out.println(sum);


        }
    }
}

