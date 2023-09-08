import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PensionFund fundInfo = new PensionFund("Pension Fund of the Russian Federation", true, "22.11.1990", 42_599);
        Pensioner pensioner = new  Pensioner("Jobs", 77, 170, 65, 2000);
        Worker worker = new Worker("test", 123, 123, 123, 12, 1233);

        fundInfo.info();
        pensioner.printInfo();
        pensioner.die();

        Worker work1 = new Worker("www", 18, 200, 200);

    }
}
