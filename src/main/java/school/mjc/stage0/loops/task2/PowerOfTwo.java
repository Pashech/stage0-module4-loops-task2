package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if(power == 0){
            System.out.println(1);
        }

        if(power < 0){
            System.out.println("too much power");
        }

        int temp = 0;
        int result = 1;

        while (temp < power){
            if (temp == 0){
                System.out.println(1);
            }
            System.out.println(result *= 2);
            temp++;
        }
    }
}
