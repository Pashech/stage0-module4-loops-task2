package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {

        int print = 0;

        while(lastPrinted >= 0){
            System.out.println(print);
            print++;
            lastPrinted--;
        }
    }
}
