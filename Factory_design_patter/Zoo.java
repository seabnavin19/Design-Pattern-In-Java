package Design_pattern.Factory_design_patter;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the type of animal you want to add: ");
        String name= inp.next();
        Animal_factory factory= new Animal_factory();
        Animal newAnimal=factory.addAnimal(name);
        System.out.println(newAnimal.getAnimal());
    }
}
