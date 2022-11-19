package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        printGCD(0, 0);
    }

    public static void printGCD(int first, int second) {
        int result;
        if(first == 0)
        {
            System.out.println(second);
        }
        if(second == 0)
        {
            System.out.println(first);
        }
        if (first != 0 && second != 0 ) {
            if(first%second==0) {
                System.out.println(second);
            } else if (second%first==0) {
                System.out.println(first);
            }
            else if(first > second) {
                result = first % second;
               if (second % result==0) {
                   System.out.println(result);
               }
            } else if (second > first) {
                result = second % first;
                if(first%result==0)
                System.out.println(result);
            }

            }
        }
        
            
        }

