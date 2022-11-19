package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        printDigitsSum(4);
    }

    public static void printDigitsSum(int t) {
        String b = String.valueOf(t);
        int digit = 0;
        int sum = 0;
        for (int i = 0; i < b.length(); i++) {
            digit = t % 10;
            sum = sum + digit;
            t = t / 10;
        }
        if (sum < 0) {
            System.out.println(sum * (-1));
        } else {
            System.out.println(sum);
        }
    }
}

