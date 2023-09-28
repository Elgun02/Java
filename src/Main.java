import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("Finland Pension Fund", true, "1892");
        Worker anna = new Worker("Anna", 19, 178, 62, 1000, 6000);
        List<Worker> membersList = new ArrayList<>();
        Set<Profession> professions = new HashSet<>();

        professions.add(Profession.PROGRAMMER);
        professions.add(Profession.DOCTOR);
        professions.add(Profession.ADVOCATE);
        professions.add(Profession.BUILDER);
        professions.add(Profession.TEACHER);
        professions.add(Profession.RACER);

        anna.setProfession(professions);
        anna.setGender(Gender.MALE);
        membersList.add(anna);
        pensionFund.setMembersList(membersList);

        pensionFund.info();
        System.out.println();
        System.out.println("Anna's salary + bonus = " + anna.calculatePension() + "$");






    }
}