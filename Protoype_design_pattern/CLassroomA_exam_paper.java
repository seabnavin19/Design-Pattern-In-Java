package Design_pattern.Protoype_design_pattern;

public class CLassroomA_exam_paper implements Example_paper{
    @Override
    public Example_paper MakeCopy() {
        CLassroomA_exam_paper exam_paper=null;
        System.out.println("exampaper of class A was copy");
        try {
            exam_paper= (CLassroomA_exam_paper) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
