class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog{
    void size(){
        System.out.println("Puppy are small in size.");
        
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.size();
        
    }
}