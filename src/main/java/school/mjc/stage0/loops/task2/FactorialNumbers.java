package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        if (printToInclusive == 0){
            System.out.println(1);
            return;
        }

        int temp = 0;
        int result = 1;

        while (temp <= printToInclusive){
            if(temp == 0){
                temp = 1;
                System.out.println(1);
            }
            System.out.println(result = result * temp);
            temp++;
        }

    }
}
