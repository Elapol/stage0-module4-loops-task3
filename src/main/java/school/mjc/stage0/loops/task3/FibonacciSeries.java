package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(11);
    }

    public static void printFibonacci(int lastFibonacci) {
        int counter;
        int f1 = 1;
        int f2 = 1;
            System.out.println(f1 + "\n" +f2);
            for (counter = 3; counter <= lastFibonacci; counter++) {
                int sum = f1 + f2;
                System.out.println(sum);
                f1 = f2;
                f2 = sum;
            }
        }
    }

