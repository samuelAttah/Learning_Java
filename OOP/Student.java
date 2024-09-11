package OOP;

public class Student {
    private String name;
    private double Cgpa;

    // TO USE A CONSTRUCTOR, YOU MUST CALL IT USING THE NAME OF THE CLASS ITSELF
    Student(String a, double b) {
        name = a;
        Cgpa = b;
    }

    public String getStudentDetails() {
        return String.format("%s has a CGPA of %.2f", this.name, this.Cgpa);
    }

}
