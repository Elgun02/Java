import java.util.Objects;

public class PensionFund {
    private String fundName;
    private boolean state;
    private final String dateOfCreation;
    private int members;

    public PensionFund(String fundName, boolean state, String dateOfCreation, int members) {
        this.fundName = fundName;
        this.state = state;
        this.dateOfCreation = dateOfCreation;
        this.members = members;
    }

    public void info() {
        System.out.println();
        System.out.println("Fund Name: " + fundName);
        System.out.println("Date of creation: " + dateOfCreation);

        if (state) {
            System.out.println("Number of members: " + members/1000 + " THOUSAND");
        }else {
            System.out.println("Number of members: " + members);
        }
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (state) {
            return obj.calculatePension();
        }
        else {
            System.out.println("деньги из фонда украли");
            return 0;
        }
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return state == that.state && members == that.members && Objects.equals(fundName, that.fundName) && Objects.equals(dateOfCreation, that.dateOfCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundName, state, dateOfCreation, members);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "fundName='" + fundName + '\'' +
                ", state=" + state +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", members=" + members +
                '}';
    }
}