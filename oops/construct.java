class Student {
    String name;
    int age;
    String state;

    public Student() {
        System.out.println("go");
    }
    public Student(String n, int i, String s) {
        name = n;
        age = i;
        state = s;
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

public class construct {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "RAM";
        s1.age = 38;
        s1.state = "GOA";
        Student s2 = new Student("shyam", 34, "Kerala");

        s1.study();
        s2.study();
        s1.showfulldetail();
        s2.showfulldetail();
    }
}
