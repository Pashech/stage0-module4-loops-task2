package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        if(printToInclusive == 0){
            return;
        }
        int temp = 2;

        while(temp <= printToInclusive){
            int divider = 1;
            int count = 0;

            while (temp >= divider){
                if(temp % divider == 0){
                    count++;
                }
                divider++;
            }
            if(count == 2){
                System.out.println(temp);
            }
            temp++;
        }
    }
}
