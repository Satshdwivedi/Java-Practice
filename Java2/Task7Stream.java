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
}

public class Task7Stream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Member ID= ");
        ArrayList<Member> member = new ArrayList<>();
       member.add(new Member(11,"Ram","ram123@gmail.com",64545789));
       member.add(new Member(12,"Shyam","shyam123@gmail.com",64545854));
       member.add(new Member(13,"Laxman","laxman123@gmail.com",645452546));
       int SId=sc.nextInt();
       Member fm=member.stream()
        .filter(m ->m.id==SId)
        .findFirst()
         .orElse(null);
if(fm==null){
    System.out.println("This is not a member");
}else {
        System.out.println("id= "+fm.id+" "+"name= "+fm.name+" "+"email= "+fm.email+" "+"phone= "+fm.phone);
}  
    
    
    }
}