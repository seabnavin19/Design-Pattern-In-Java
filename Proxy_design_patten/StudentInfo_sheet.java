package Design_pattern.Proxy_design_patten;

public class StudentInfo_sheet implements ReadData{
    public void EditStudent_Info(){
        System.out.println("Enter The ID of student you want to update");
    }

    @Override
    public void ReadStudentInfo() {
        System.out.println("this is the list of all student in..\n ...\n....\n...");
    }

    @Override
    public void SeeHighestScore() {
        System.out.println("the highest score in school is kaka");
    }
}
