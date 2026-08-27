import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(s.id, this.id);// yahan yadi Integer.compare(this.id,s.id) likhe to id ke ascending order
                                              // milenge
    }
}

public class Compare {
    public static void main(String[] args) {

        ArrayList<Student>students=new ArrayList<>();
        students.add(new Student(103,"Ram",35));
        students.add(new Student(101,"Shyam",32));
        students.add(new Student(102,"Mohan",30));
        Collections.sort(students);
        for(Student s:students){
            System.out.println(s.id+" "+s.name+" "+s.age);}
            Comparator<Student>nsort=(s1,s2)->s1.name.compareTo(s2.name);// yadi yahan decending order of alphabatical chahiye to s2.name.compareTo(s1.name)
           Collections.sort(students,nsort); 
           for(Student p:students){
            System.out.println(p.id+" "+p.name+" "+p.age);}
            Comparator<Student>asort=(p1,p2)->Integer.compare(p1.age,p2.age);
            Collections.sort(students,asort); 
           for(Student q:students){
            System.out.println(q.id+" "+q.name+" "+q.age);
}
}
}