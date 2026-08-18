import java.util.ArrayList;
class Student1{
    String name;
    int age;
    Student1(String name,int age){
        this.name=name;
        this.age=age;
}
}
public class Arraylistobject2{
    public static void main(String[] args) {
 ArrayList<Student1>students=new ArrayList <>();
students.add(new Student1("Ram",30));
students.add(new Student1("Shyam",32));
students.add(new Student1("Laxman",31));
for(int i=0;i<students.size();i++){
    if(students.get(i).age==31){
        System.out.println("Student Found");
        System.out.println("Name = " + students.get(i).name);
        System.out.println("Age = " + students.get(i).age);
    }
}
}
}