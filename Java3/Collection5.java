import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
}
}

public class Collection5{
    public static void main(String[] args) {
    Comparator<Student>nameSort=new Comparator<Student>(){
    @Override
    public int  compare(Student s1,Student s2)
{
    return s1.name.compareTo(s2.name);
}
};
        ArrayList<Student>students=new ArrayList<>();
        students.add(new Student(103,"Ram"));
        students.add(new Student(101,"Shyam"));
        students.add(new Student(102,"Mohan"));
        Collections.sort(students,nameSort);
        for(Student s:students){
            System.out.println(s.id+" "+s.name);
        }
    }
}