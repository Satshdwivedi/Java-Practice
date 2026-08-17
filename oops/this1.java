class Student1
{
    String name;
    int age;
    String state;

    public Student1() {
        System.out.println("go");
    }
    public Student1(String name, int age, String state) {
        this.name = name;
        this.age = age;
        this.state = state;
    }
    public void study() {
        System.out.println(name + " is studying");
    }

    public void showfulldetail() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("I live in " + state);
    }
}

public class this1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "RAM";
        s1.age = 38;
        s1.state = "GOA";
        Student1 s2 = new Student1("shyam", 34, "Kerala");

        s1.study();
        s2.study();
        s1.showfulldetail();
        s2.showfulldetail();
    }
}
