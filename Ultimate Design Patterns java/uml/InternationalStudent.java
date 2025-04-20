package uml;

public class InternationalStudent extends Student{

    private String countryOfOrigin;
    private String visaStatus;

    public InternationalStudent(String name, int age, int studentID) {
        super(name, age, studentID);
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getVisaStatus() {
        return visaStatus;
    }
}
