package Design_pattern.Proxy_design_patten;

public class ProxyFile implements ReadData{
    StudentInfo_sheet studentInfo_sheet;
    @Override
    public void ReadStudentInfo() {
        this.studentInfo_sheet=new StudentInfo_sheet();
        studentInfo_sheet.ReadStudentInfo();

    }

    @Override
    public void SeeHighestScore() {
        this.studentInfo_sheet=new StudentInfo_sheet();
        studentInfo_sheet.SeeHighestScore();
    }
}
