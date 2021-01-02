package Design_pattern.Template_Design_pattern;

public  abstract class ExamPaperTemplate {
    abstract void VerticalLine();
    abstract void Name();
    abstract void Date();
    abstract void  HorizontalLine();
    public void makeExamPaper(){
        Name();
        Date();
        if (SchoolWantHorizontal()){
            HorizontalLine();
        }
    }
    boolean SchoolWantHorizontal(){return true;}
}
