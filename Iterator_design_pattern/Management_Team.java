package Design_pattern.Iterator_design_pattern;

public class Management_Team {
    public static void main(String[] args) {
        SectionB sectionB= new SectionB();
        KIT_Institute kit= new KIT_Institute(sectionB);
        kit.ShowStudent();
    }
}
