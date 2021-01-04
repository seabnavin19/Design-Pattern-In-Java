package Design_pattern.Protoype_design_pattern;

public class Printer_machine {
   public Example_paper getCopy(Example_paper example_paper){
       System.out.println("copy of "+example_paper.toString()+" was created");
       return example_paper.MakeCopy();
   }
}
