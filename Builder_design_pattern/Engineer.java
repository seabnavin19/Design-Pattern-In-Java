package Design_pattern.Builder_design_pattern;

public class Engineer {
   private Builder builder;
   Engineer(Builder builder){
       this.builder=builder;
   }
   public void CreateRobot(){
       this.builder.BuildHead();
       this.builder.BuildHand();
       this.builder.Buildleg();
   }
   public Robot getRobot(){
       return this.builder.getRobot();
   }
}
