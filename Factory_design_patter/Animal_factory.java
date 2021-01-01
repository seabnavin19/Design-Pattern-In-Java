package Design_pattern.Factory_design_patter;

public class Animal_factory {
    public Animal addAnimal(String name){
        if (name.equals("cow")){
            return new cow();
        }
        if (name.equals("bird")){
            return new bird();
        }
        return null;
    }
}
