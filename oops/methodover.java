class Animal {
    String name;
    String colour;

    public Animal(String name) {
        this.name=name;
        System.out.println("Animal name= "+name);
    }
    public void sound(){
        System.out.println("Animal sound is good");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void details() {
        System.out.println("Name of Animal= " + name);
        System.out.println("Colour of Animal= " + colour);
    }
}

class Dog extends Animal {
    public Dog(String name,String colour) {
        super(name);
        this.colour=colour;

        System.out.println("Dog Colour= "+colour);
    }
    public void sound(){
        System.out.println("Dog sound is bad");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class methodover {
    public static void main(String[] args) {
        Animal a1 = new Animal("cat");
        Animal a2 = new Animal("Mouse");
        //a1.name = "Cat";
        a1.colour = "white";
       // a2.name = "Mouse";
        a2.colour = "black";
        a1.eat();
        a1.details();
        a1.sound();
        a2.sound();
        a2.eat();
        a2.details();
        Dog d1 = new Dog("Browny","Brown");
        Animal a3= new Dog("Tommy","Black");
       // d1.name = "Browny";
       // d1.colour = "Brown";
        a3.sound();
        d1.eat();
        d1.details();
        d1.bark();
        d1.sound();
    }
}
