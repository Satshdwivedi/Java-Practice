import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
int id;
String name;
int age;
public Student(int id,String name,int age){
    this.id=id;
    this.name=name;
    this.age=age;
}
}
public class Rev{
    public static void main(String[] args) {
    Comparator<Student>agesort=new Comparator<Student>(){
        @Override
        public int compare(Student s1,Student s2){
            return Integer.compare(s1.age,s2.age);
        }
    };
    ArrayList<Student>stu=new ArrayList<>(List.of(new Student(101,"Ram",21),
                              new Student(102,"Shyam",20),
                              new Student(103,"Mohan",21),
                              new Student(104,"Ravi",22)));
                   Collections.sort(stu,agesort);
                   for(Student s:stu){
                    System.out.println(s.id+" "+s.name+" "+s.age);
                   }
                   stu.stream()
                   .filter(s->s.age==21)
                   .forEach(s->System.out.println(s.name));
      

    }
}