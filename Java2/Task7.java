import java.util.ArrayList;
import java.util.Scanner;
class Member {
    int id;
    String name;
    String email;
    long phone;

    public Member(int id, String name, String email, long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    int getBorrowLimit(){
        return 0;
    }
}
class Student extends Member{
    public Student(int id, String name, String email, long phone){
    super( id, name,email, phone);
    }
    @Override
    int getBorrowLimit(){
        return 3;
    }
}
class Faculty extends Member{
    public Faculty(int id, String name, String email, long phone){
        super( id, name,email, phone);
    }
    @Override
    int getBorrowLimit(){
        return 5;
    }
}

public class Task7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Member ID= ");
        ArrayList<Member> member = new ArrayList<>();
       member.add(new Student(11,"Ram","ram123@gmail.com",64545789));
       member.add(new Student(12,"Shyam","shyam123@gmail.com",64545854));
       member.add(new Faculty(13,"Laxman","laxman123@gmail.com",645452546));
       int SId=sc.nextInt();
       boolean f=false;
       for(Member m:member){
        if(m.id==SId){
            f=true;
        System.out.println("id= "+m.id+" "+"name= "+m.name+" "+"email= "+m.email+" "+"phone= "+m.phone);
       
       System.out.println("Borrow limit = "+m.getBorrowLimit());
        }
    }
    if(f==false){
        System.out.println("This is not a Member ");
    }
    
    }
}