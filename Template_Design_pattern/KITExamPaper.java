package Design_pattern.Template_Design_pattern;

public class KITExamPaper extends ExamPaperTemplate{

    @Override
    void VerticalLine() {
        System.out.println("Please draw vertical line every page");
    }

    @Override
    void Name() {
        System.out.println("please put your name at top-left");
    }

    @Override
    void Date() {
        System.out.println("please put The Date at top-right");
    }

    @Override
    void HorizontalLine() {
    }
    boolean SchoolWantHorizontal(){return false;}
}
