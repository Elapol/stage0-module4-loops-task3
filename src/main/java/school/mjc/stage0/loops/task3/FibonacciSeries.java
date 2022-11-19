package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(5);
    }

    public static void printFibonacci(int lastFibonacci) {
        int f1 = 0;
        int f2 = 1;
        int sum;
        System.out.println(f1 + "\n" + f2);
        for (int counter = 3; counter <= lastFibonacci; counter++) {
         sum=f1+f2;
         System.out.println(sum);
         f1=f2;
         f2=sum;
        }
    }
}

