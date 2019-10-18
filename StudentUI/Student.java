
public class Student {

    private String Name;
    private String ID;
    private double Grade;

    public Student(String Name, String ID, double Grade) {

        this.Name = Name;
        this.ID = ID;
        this.Grade = Grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double grade) {
        this.Grade = grade;
    }

    public String format() {
        return getName() + " " + getID() + " | Grade: " + getGrade() + "\n";
    }

}