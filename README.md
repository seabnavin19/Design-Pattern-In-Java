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

Code: [Factory design pattern](https://github.com/seabnavin19/Design-Pattern-In-Java/tree/master/Factory_design_patter)

# What is Abstract Factory?

 Abstract factory is a creational design pattern that allow us to create object base on its categories and type .

# When To Use it ?

It is very importance to know when to use it because when we face the problem we can identify the specify design pattern to use. And these are some situation that we should use it

- when we want to create object dynamic and  group it into category
- when we don't want user to know all the subclass

## What are the problem to use the Pattern?

Example : Apple company they produce Phone and Laptop so if they put all the product(phone and laptop) in one factory it will be cause a problem in flow of creation so inorder to avoid this they have 2 factory one for phone and another one  for laptop. 

So when the user want to get Iphone iphone company will go to ask to phone factory not laptop factory.

## Coding Part

code: [Abstract factory](https://github.com/seabnavin19/Design-Pattern-In-Java/tree/master/AbstractFactory)

# Builder Design pattern
## What is Builder Design pattern ?

Builder design pattern is a design pattern that simplify the object creation when we have complex attribute of object . It will separate each attribute to a builder.

## When Should we Use Builder Design pattern?

- When an object has a lot of attribute
- number of attribute is dynamic
- when the user want to customize the attribute of the object
- hide the createtion from client only the builder class know

## Which type of problem that we should use Builder?

- we use this type of problem when we want to get one object by building it step by step
- For example : when we want to build a robot and we want a stakeholder to decide what type of robot they want (oldstyle,modern,fast) after get the requirement from customer Engineer analyse it and choose which team of builders will doing this task. So it Engineer choose oldStyle Builder they will built an old style Robot step by step until finish.

## Coding Part

code:  [builder design pattern](https://github.com/seabnavin19/Design-Pattern-In-Java/tree/master/Builder_design_pattern)
# Singleton Design pattern
## What is Singleton design Pattern?

singleton design pattern it is a design pattern that allow us to create only one object of a class

## when To use this design pattern?

 We use this design pattern when :

- Allow user to create only one object of the class
- Make all the class use only that one object

## What is the problem to use this Pattern?

For Example: We make an application that get the attendance in a company so we will have a president in that company . In this situation we need to make president class to be singleton that mean we are not allow to create another president until current president is not available.

## Coding Part

code: [singleton design pattern](https://github.com/seabnavin19/Design-Pattern-In-Java/tree/master/singleton)


