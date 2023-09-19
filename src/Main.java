import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund();
        List<Worker> membersList = new ArrayList<>();
        List<Worker> list = new LinkedList<>();

        Worker anna = new Worker("Anna", 19, 178, 62, 1000, 6000);
        Worker albert = new Worker("Albert", 20, 188, 82, 1000, 5000);
        Worker johan = new Worker("Johan", 21, 175, 72, 1000, 4000);

        anna.setGender(Gender.FEMALE);
        albert.setGender(Gender.MALE);
        johan.setGender(Gender.MALE);

        membersList.add(anna);
        membersList.add(albert);
        membersList.add(johan);

        list.add(anna);
        list.add(albert);
        list.add(johan);

        pensionFund.setMembersList(membersList);
        System.out.println(pensionFund.calculateMedianPension());
        pensionFund.setMembersList(list);
        System.out.println(pensionFund.calculateMedianPension());

    }
}