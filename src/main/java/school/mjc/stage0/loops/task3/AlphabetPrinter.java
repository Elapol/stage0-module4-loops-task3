package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void main(String[] args) {
        printAlphabet();
    }
    public static void printAlphabet() {
        char alphabet;
        for(alphabet = 65;alphabet<=90;alphabet++)
            System.out.println(alphabet);
    }
}
