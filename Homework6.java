/**
* Java 1. Homework6
* @author Margarita Morozova
* @version 02.3.2022
*/
class Homework6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal.toRun(199));
            System.out.println(animal.toRun(201));
            System.out.println(animal.toRun(499));
            System.out.println(animal.toRun(501));
            System.out.println(animal.toSwim(0));
            System.out.println(animal.toSwim(9));
            System.out.println(animal.toSwim(11));
        }
    }
}

class Cat extends Animal {
    Cat(int runLimit) {
        super(runLimit, 0);
    }

    @Override
    public String toSwim(int distance) {
        return "Cat can't swim";
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

interface IAnimal {
    String toRun(int distance);
    String toSwim(int distance);
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public String toRun(int distance) {
        if (distance > runLimit) {
            return "Unsuccessful running: " + distance + ", it can run only: " + runLimit;
        } else {
            return "Successful running: " + distance;
        }    
    }

    public String toSwim(int distance) {
        if (distance > swimLimit) {
            return "Unsuccessful swimming: " + distance + ", it can swim only: " + swimLimit;
        } else {
            return "Successful swimming: " + distance;
        }    
    }

    @Override
    public String toString() {
        return runLimit + ", " + swimLimit;
    }
}
