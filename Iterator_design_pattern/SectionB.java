package Design_pattern.Iterator_design_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SectionB implements StudentIterator{
    ArrayList<StudentInfo> students;
    SectionB(){
        students=new ArrayList<StudentInfo>();
        addstudent("navin",18);
        addstudent("huameng",18);
    }
    @Override
    public Iterator createIterator() {
        return students.iterator();
    }
    public void addstudent(String Name,int Age){
        StudentInfo studentInfo= new StudentInfo(Name,Age);
        students.add(studentInfo);
    }

}
