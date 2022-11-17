package school.mjc.stage0.loops.task3;

public class RangeSum {
    public static void main(String[] args) {
        printSumInclusive(2, 8); //  2 3 4 5 6 7 8 =35
    }

    public static void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;

        //if (counter >= firstBoarder && counter <= secondBoarder) {
        for (int counter =  firstBoarder; counter <= secondBoarder; counter++) {
            result = result + counter;
            if (counter == secondBoarder) {
                System.out.println(result);

            }
        }
    }
}


