class Animal {
    String name;
    String colour;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void details() {
        System.out.println("Name of Animal= " + name);
        System.out.println("Colour of Animal= " + colour);
    }
}

class Dog extends Animal {
}

public class inheritence {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.name = "Cat";
        a1.colour = "white";
        a2.name = "Mouse";
        a2.colour = "black";
        a1.eat();
        a1.details();
        a2.eat();
        a2.details();
        Dog d1 = new Dog();
        d1.name="Browny";
        d1.colour="Brown";

        d1.eat();
        d1.details();
    }
}
