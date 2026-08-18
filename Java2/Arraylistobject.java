import java.util.ArrayList;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Arraylistobject { 
  public static void main(String[] args) {
ArrayList<Student>students = new ArrayList<>();
    students.add(new Student("Anshul",35));
    students.add(new Student("Vipin",39));
    students.add(new Student("Rahul",45));
    for(int i=0;i<students.size();i++){
    System.out.println(students.get(i).name+" "+students.get(i).age);
    }
  }
}