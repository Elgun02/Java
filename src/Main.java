import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("Finland Pension Fund", true, "1892");
        List<Worker> membersList = new ArrayList<>();

        Worker anna = new Worker("Anna", 19, 178, 62, 1000, 6000);
        Worker albert = new Worker("Albert", 20, 188, 82, 1000, 5000);
        Worker johan = new Worker("Johan", 21, 175, 72, 1000, 4000);

        anna.setGender(Gender.FEMALE);
        albert.setGender(Gender.MALE);
        johan.setGender(Gender.MALE);

        membersList.add(anna);
        membersList.add(albert);
        membersList.add(johan);

        pensionFund.setMembersList(membersList);
        pensionFund.info();
        System.out.println("Average pension value: " + (int)pensionFund.calculateMedianPension() + "$");
    }
}