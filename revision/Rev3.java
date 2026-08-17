class Person{
   private String name;
   public void setName(String name){
    this.name=name;
   } 
   public String getName(){
    return name;
   }
   public void show(){
    System.out.println("Person");
   }
}
class Student8 extends Person implements Printable{
    public void show(){
        System.out.println("Study");
    }
    public void print(){
        System.out.println("Rewa");
    }
    static void info(){
        System.out.println("M.P.");
    }
}
interface Printable{
     void print();
}
public class Rev3{
    public static void main(String[]args){
        Student8 s1=new Student8();
        s1.setName("Ansul");
        System.out.println(s1.getName());
        s1.show();
        s1.print();
    Student8.info();
    }
}
