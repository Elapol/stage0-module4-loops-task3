package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(5);
    }
    public static void printFibonacci(int lastFibonacci) {
        int counter;
        int f1=0;
        int f2=1;
        if(lastFibonacci>0) {
            System.out.println(0);
        }
        if(lastFibonacci<1) {
            System.out.println(f1);
        } for (counter=0;counter<lastFibonacci;counter++) {
            System.out.println(f2);
            int elseBigger=f1+f2;
            f1=f2;
            f2=elseBigger;
        } System.out.println(f2);
    }
}
