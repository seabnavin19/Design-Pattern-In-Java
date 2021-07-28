# Design-Pattern-In-Java
Factory design pattern it is a creation design pattern that use to create the object dynamicly.

## When Should we use Factory Design Pattern ?

- when we want to create a dynamic class
- we don't want the user to know all the subclass
- we don't know before what type of class that we are going to create
- when we want to centralize the creation of object within a class(factory class)
- To encapulate the creation of objects

## Which type of problem when we use this design pattern ?

For example we create a system for an international school that have all asian students so when we want to add a new student we don't know before hand what nationality of that student we need to ask them. In this case we will use if else / switch case to create object. if we write all if else statement in the main it will mess up our code. So that why factory design pattern came in because we can write if else statement in our factory class.

## Implementation Part

this is an example of Bad code that doesn't use Factory pattern

```java
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the type of animal you want to add: ");
        String name= inp.next();
        if (name.equals("cow")){
            cow dav= new cow();
            dav.setMilk(190);
            System.out.println(dav.getAnimal());
        }
        else if (name.equals("bird")){
            bird nana= new bird();
            nana.setFlyspeed(123);
            System.out.println(nana.getAnimal());
        }

    }
}
```

You can see thiss is just 2 type of animal we write a lot of code in our main class. What if we have 100 type of animal our main class will be mess up. so to avoid this we should use factory design pattern .

```java
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
```

Now  we can remove all if else or switch case statement from our main class instead we write it in factory class

```java
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
```

Git Hub for full code: [Factory design pattern](https://github.com/seabnavin19/Design-Pattern-In-Java/tree/master/Factory_design_patter)
