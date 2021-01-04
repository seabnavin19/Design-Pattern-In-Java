package Design_pattern.Protoype_design_pattern;

public class Client {
    public static void main(String[] args) {
        Printer_machine printer=new Printer_machine();
        CLassroomA_exam_paper abi= new CLassroomA_exam_paper();
        CLassroomA_exam_paper copy= (CLassroomA_exam_paper) printer.getCopy(abi);
    }
}
