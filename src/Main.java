import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Adrian", 19, 178, 62, 3000, 4500);

        System.out.println(CalculatorUtils.calculateAverage(1500, 7500,15000));
        System.out.println(CalculatorUtils.calculateAverage(10,20,30));

        System.out.println(worker.calculatePension());

    }
}
