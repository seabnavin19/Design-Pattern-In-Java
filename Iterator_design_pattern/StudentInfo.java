package Design_pattern.Iterator_design_pattern;

public class StudentInfo {
    String Name;
    int Age;
    StudentInfo(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;

    }
}
