package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {

        int print = 1;

        while (printTillInclusive > 0){
            if(print % 2 == 0){
                System.out.println(print);
            }
            print++;
            printTillInclusive--;
        }
    }
}
