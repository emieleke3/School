public class Office extends Building {
    private String companyname;
    private int numberOfEmployees;

    public Office(String address, String zipCode, int area, String companyname, int numberOfEmployees) {
        super(address, zipCode, area);
        this.companyname = companyname;
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Office{" +
                "companyname='" + companyname + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", area=" + area +
                '}';
    }
}
