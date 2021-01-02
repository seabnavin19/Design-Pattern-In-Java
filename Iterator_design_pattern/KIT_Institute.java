package Design_pattern.Iterator_design_pattern;

import java.util.Iterator;

public class KIT_Institute {
    StudentIterator iterSectionB;
    public KIT_Institute(StudentIterator iterSectionB){
        this.iterSectionB=iterSectionB;
    }
    public void ShowStudent(){
        Iterator SectionB_Students=iterSectionB.createIterator();
        System.out.println("Section B Students:");
        getStudentInfo(SectionB_Students);
    }
    public void getStudentInfo(Iterator iterator){
        while (iterator.hasNext()){
            StudentInfo studentInfo= (StudentInfo) iterator.next();
            System.out.print(studentInfo.getName()+" ");
            System.out.println(studentInfo.getAge());

        }
    }
}
